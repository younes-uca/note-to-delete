package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.SemesterAverageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterAverageHistoryDao extends AbstractHistoryRepository<SemesterAverageHistory,Long> {

}
