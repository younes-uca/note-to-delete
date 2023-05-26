package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.SemesterModuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterModuleHistoryDao extends AbstractHistoryRepository<SemesterModuleHistory,Long> {

}
