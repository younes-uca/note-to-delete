package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Training;
import ma.sir.note.dao.criteria.core.TrainingCriteria;
import ma.sir.note.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface TrainingAdminService extends  IService<Training,TrainingCriteria, TrainingHistoryCriteria>  {

    List<Training> findByStudentId(Long id);
    int deleteByStudentId(Long id);



}
