package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.ExamGradeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamGradeHistoryDao extends AbstractHistoryRepository<ExamGradeHistory,Long> {

}
