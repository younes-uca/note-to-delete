package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.SemesterModule;
import ma.sir.pmp.dao.criteria.core.SemesterModuleCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface SemesterModuleAdminService extends  IService<SemesterModule,SemesterModuleCriteria, SemesterModuleHistoryCriteria>  {

    List<SemesterModule> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<SemesterModule> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);



}
