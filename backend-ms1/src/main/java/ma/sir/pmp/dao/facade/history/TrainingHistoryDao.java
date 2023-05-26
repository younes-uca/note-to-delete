package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.TrainingHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingHistoryDao extends AbstractHistoryRepository<TrainingHistory,Long> {

}
