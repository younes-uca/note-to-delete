package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Module;
import ma.sir.note.dao.criteria.core.ModuleCriteria;
import ma.sir.note.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface ModuleAdminService extends  IService<Module,ModuleCriteria, ModuleHistoryCriteria>  {




}
