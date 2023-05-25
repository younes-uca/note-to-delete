package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.SemesterModule;
import ma.sir.note.dao.criteria.core.SemesterModuleCriteria;
import ma.sir.note.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface SemesterModuleAdminService extends  IService<SemesterModule,SemesterModuleCriteria, SemesterModuleHistoryCriteria>  {

    List<SemesterModule> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<SemesterModule> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);



}
