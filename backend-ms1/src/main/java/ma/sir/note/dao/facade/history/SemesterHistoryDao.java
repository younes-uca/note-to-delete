package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.SemesterHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterHistoryDao extends AbstractHistoryRepository<SemesterHistory,Long> {

}
