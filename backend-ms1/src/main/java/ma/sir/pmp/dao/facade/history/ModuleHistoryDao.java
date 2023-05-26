package ma.sir.pmp.dao.facade.history;

import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.bean.history.ModuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleHistoryDao extends AbstractHistoryRepository<ModuleHistory,Long> {

}
