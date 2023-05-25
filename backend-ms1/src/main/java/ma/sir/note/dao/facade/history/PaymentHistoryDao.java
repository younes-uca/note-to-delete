package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.PaymentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHistoryDao extends AbstractHistoryRepository<PaymentHistory,Long> {

}
