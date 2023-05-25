package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.ExamHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamHistoryDao extends AbstractHistoryRepository<ExamHistory,Long> {

}
