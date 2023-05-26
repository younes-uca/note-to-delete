package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.SemesterHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterHistoryDao extends AbstractHistoryRepository<SemesterHistory,Long> {

}
