package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.Payment;
import ma.sir.note.bean.history.PaymentHistory;
import ma.sir.note.dao.criteria.core.PaymentCriteria;
import ma.sir.note.dao.criteria.history.PaymentHistoryCriteria;
import ma.sir.note.dao.facade.core.PaymentDao;
import ma.sir.note.dao.facade.history.PaymentHistoryDao;
import ma.sir.note.dao.specification.core.PaymentSpecification;
import ma.sir.note.service.facade.admin.PaymentAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.note.zynerator.util.VelocityPdf;
import ma.sir.note.ws.dto.PaymentDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.StudentAdminService ;
import ma.sir.note.service.facade.admin.SemesterAdminService ;
import ma.sir.note.service.facade.admin.TrainingAdminService ;


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
    private StudentAdminService studentService ;
    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private TrainingAdminService trainingService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public PaymentAdminServiceImpl(PaymentDao dao, PaymentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}