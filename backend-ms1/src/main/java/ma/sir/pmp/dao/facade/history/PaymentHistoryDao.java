package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.PaymentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHistoryDao extends AbstractHistoryRepository<PaymentHistory,Long> {

}
