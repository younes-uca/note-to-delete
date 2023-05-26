package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Semester;
import ma.sir.pmp.dao.criteria.core.SemesterCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface SemesterAdminService extends  IService<Semester,SemesterCriteria, SemesterHistoryCriteria>  {

    List<Semester> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);



}
