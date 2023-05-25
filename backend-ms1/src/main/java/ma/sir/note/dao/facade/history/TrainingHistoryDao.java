package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.TrainingHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingHistoryDao extends AbstractHistoryRepository<TrainingHistory,Long> {

}
