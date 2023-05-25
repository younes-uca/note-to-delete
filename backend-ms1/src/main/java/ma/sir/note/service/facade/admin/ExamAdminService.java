package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Exam;
import ma.sir.note.dao.criteria.core.ExamCriteria;
import ma.sir.note.dao.criteria.history.ExamHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface ExamAdminService extends  IService<Exam,ExamCriteria, ExamHistoryCriteria>  {

    List<Exam> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<Exam> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);



}
