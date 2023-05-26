package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Diploma;
import ma.sir.pmp.dao.criteria.core.DiplomaCriteria;
import ma.sir.pmp.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface DiplomaAdminService extends  IService<Diploma,DiplomaCriteria, DiplomaHistoryCriteria>  {

    List<Diploma> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Diploma> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);



}
