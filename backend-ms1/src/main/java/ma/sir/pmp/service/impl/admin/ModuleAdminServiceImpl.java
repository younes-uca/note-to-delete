package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.Module;
import ma.sir.pmp.bean.history.ModuleHistory;
import ma.sir.pmp.dao.criteria.core.ModuleCriteria;
import ma.sir.pmp.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.pmp.dao.facade.core.ModuleDao;
import ma.sir.pmp.dao.facade.history.ModuleHistoryDao;
import ma.sir.pmp.dao.specification.core.ModuleSpecification;
import ma.sir.pmp.service.facade.admin.ModuleAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ModuleAdminServiceImpl extends AbstractServiceImpl<Module,ModuleHistory, ModuleCriteria, ModuleHistoryCriteria, ModuleDao,
ModuleHistoryDao> implements ModuleAdminService {


    public Module findByReferenceEntity(Module t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Module.class,ModuleHistory.class, ModuleHistoryCriteria.class, ModuleSpecification.class);
    }


    public ModuleAdminServiceImpl(ModuleDao dao, ModuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}