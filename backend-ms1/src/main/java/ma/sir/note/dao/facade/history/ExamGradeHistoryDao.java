package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.ExamGradeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamGradeHistoryDao extends AbstractHistoryRepository<ExamGradeHistory,Long> {

}
