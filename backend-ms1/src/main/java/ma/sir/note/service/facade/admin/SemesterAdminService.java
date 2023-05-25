package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Semester;
import ma.sir.note.dao.criteria.core.SemesterCriteria;
import ma.sir.note.dao.criteria.history.SemesterHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface SemesterAdminService extends  IService<Semester,SemesterCriteria, SemesterHistoryCriteria>  {

    List<Semester> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);



}
