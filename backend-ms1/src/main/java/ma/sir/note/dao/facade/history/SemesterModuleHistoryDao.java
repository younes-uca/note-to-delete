package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.SemesterModuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterModuleHistoryDao extends AbstractHistoryRepository<SemesterModuleHistory,Long> {

}
