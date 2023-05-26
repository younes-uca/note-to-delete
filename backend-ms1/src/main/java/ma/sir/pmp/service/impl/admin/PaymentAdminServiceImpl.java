package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.Payment;
import ma.sir.pmp.bean.history.PaymentHistory;
import ma.sir.pmp.dao.criteria.core.PaymentCriteria;
import ma.sir.pmp.dao.criteria.history.PaymentHistoryCriteria;
import ma.sir.pmp.dao.facade.core.PaymentDao;
import ma.sir.pmp.dao.facade.history.PaymentHistoryDao;
import ma.sir.pmp.dao.specification.core.PaymentSpecification;
import ma.sir.pmp.service.facade.admin.PaymentAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.pmp.zynerator.util.VelocityPdf;
import ma.sir.pmp.ws.dto.PaymentDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.SemesterAdminService ;
import ma.sir.pmp.service.facade.admin.TrainingAdminService ;
import ma.sir.pmp.service.facade.admin.StudentAdminService ;


import java.util.List;
@Service
public class PaymentAdminServiceImpl extends AbstractServiceImpl<Payment,PaymentHistory, PaymentCriteria, PaymentHistoryCriteria, PaymentDao,
PaymentHistoryDao> implements PaymentAdminService {
    public static final String TEMPLATE = "template/payment.vm";
    public static final String FILE_NAME = "payment.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(PaymentDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<Payment> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }
    public List<Payment> findByTrainingId(Long id){
        return dao.findByTrainingId(id);
    }
    public int deleteByTrainingId(Long id){
        return dao.deleteByTrainingId(id);
    }
    public List<Payment> findBySemesterId(Long id){
        return dao.findBySemesterId(id);
    }
    public int deleteBySemesterId(Long id){
        return dao.deleteBySemesterId(id);
    }



    public void configure() {
        super.configure(Payment.class,PaymentHistory.class, PaymentHistoryCriteria.class, PaymentSpecification.class);
    }

    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private TrainingAdminService trainingService ;
    @Autowired
    private StudentAdminService studentService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public PaymentAdminServiceImpl(PaymentDao dao, PaymentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}