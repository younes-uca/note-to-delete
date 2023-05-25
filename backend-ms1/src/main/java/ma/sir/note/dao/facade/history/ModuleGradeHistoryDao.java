package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.ModuleGradeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleGradeHistoryDao extends AbstractHistoryRepository<ModuleGradeHistory,Long> {

}
