package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Exam;
import ma.sir.pmp.dao.criteria.core.ExamCriteria;
import ma.sir.pmp.dao.criteria.history.ExamHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface ExamAdminService extends  IService<Exam,ExamCriteria, ExamHistoryCriteria>  {

    List<Exam> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<Exam> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);



}
