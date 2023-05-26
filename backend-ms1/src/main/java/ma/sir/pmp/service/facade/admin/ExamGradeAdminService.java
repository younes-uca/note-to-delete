package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.ExamGrade;
import ma.sir.pmp.dao.criteria.core.ExamGradeCriteria;
import ma.sir.pmp.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface ExamGradeAdminService extends  IService<ExamGrade,ExamGradeCriteria, ExamGradeHistoryCriteria>  {

    List<ExamGrade> findByExamId(Long id);
    int deleteByExamId(Long id);
    List<ExamGrade> findByStudentId(Long id);
    int deleteByStudentId(Long id);



}
