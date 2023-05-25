package ma.sir.note.dao.facade.core;

import ma.sir.note.zynerator.repository.AbstractRepository;
import ma.sir.note.bean.core.Payment;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaymentDao extends AbstractRepository<Payment,Long>  {

    List<Payment> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Payment> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);
    List<Payment> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

}
