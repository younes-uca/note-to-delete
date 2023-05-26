package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.SemesterAverageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterAverageHistoryDao extends AbstractHistoryRepository<SemesterAverageHistory,Long> {

}
