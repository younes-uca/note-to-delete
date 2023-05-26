package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.StudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentHistoryDao extends AbstractHistoryRepository<StudentHistory,Long> {

}
