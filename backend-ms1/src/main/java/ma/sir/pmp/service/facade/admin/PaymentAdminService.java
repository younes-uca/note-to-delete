package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Payment;
import ma.sir.pmp.dao.criteria.core.PaymentCriteria;
import ma.sir.pmp.dao.criteria.history.PaymentHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;

import ma.sir.pmp.ws.dto.PaymentDto;
import org.springframework.http.HttpEntity;

public interface PaymentAdminService extends  IService<Payment,PaymentCriteria, PaymentHistoryCriteria>  {

    List<Payment> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Payment> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);
    List<Payment> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

    HttpEntity<byte[]> createPdf(PaymentDto dto) throws Exception;


}
