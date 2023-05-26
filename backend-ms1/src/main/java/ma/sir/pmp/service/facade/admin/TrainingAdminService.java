package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Training;
import ma.sir.pmp.dao.criteria.core.TrainingCriteria;
import ma.sir.pmp.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface TrainingAdminService extends  IService<Training,TrainingCriteria, TrainingHistoryCriteria>  {

    List<Training> findByStudentId(Long id);
    int deleteByStudentId(Long id);



}
