package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.ExamHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamHistoryDao extends AbstractHistoryRepository<ExamHistory,Long> {

}
