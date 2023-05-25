package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.ExamGrade;
import ma.sir.note.dao.criteria.core.ExamGradeCriteria;
import ma.sir.note.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface ExamGradeAdminService extends  IService<ExamGrade,ExamGradeCriteria, ExamGradeHistoryCriteria>  {

    List<ExamGrade> findByExamId(Long id);
    int deleteByExamId(Long id);
    List<ExamGrade> findByStudentId(Long id);
    int deleteByStudentId(Long id);



}
