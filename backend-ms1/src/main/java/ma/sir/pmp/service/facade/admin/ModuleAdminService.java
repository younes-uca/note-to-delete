package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Module;
import ma.sir.pmp.dao.criteria.core.ModuleCriteria;
import ma.sir.pmp.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface ModuleAdminService extends  IService<Module,ModuleCriteria, ModuleHistoryCriteria>  {




}
