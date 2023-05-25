package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.Module;
import ma.sir.note.bean.history.ModuleHistory;
import ma.sir.note.dao.criteria.core.ModuleCriteria;
import ma.sir.note.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.note.dao.facade.core.ModuleDao;
import ma.sir.note.dao.facade.history.ModuleHistoryDao;
import ma.sir.note.dao.specification.core.ModuleSpecification;
import ma.sir.note.service.facade.admin.ModuleAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
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