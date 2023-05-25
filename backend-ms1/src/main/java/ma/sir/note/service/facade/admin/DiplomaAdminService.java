package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Diploma;
import ma.sir.note.dao.criteria.core.DiplomaCriteria;
import ma.sir.note.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface DiplomaAdminService extends  IService<Diploma,DiplomaCriteria, DiplomaHistoryCriteria>  {

    List<Diploma> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Diploma> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);



}
