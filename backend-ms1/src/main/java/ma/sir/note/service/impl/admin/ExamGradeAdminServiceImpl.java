package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.ExamGrade;
import ma.sir.note.bean.history.ExamGradeHistory;
import ma.sir.note.dao.criteria.core.ExamGradeCriteria;
import ma.sir.note.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.note.dao.facade.core.ExamGradeDao;
import ma.sir.note.dao.facade.history.ExamGradeHistoryDao;
import ma.sir.note.dao.specification.core.ExamGradeSpecification;
import ma.sir.note.service.facade.admin.ExamGradeAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.ExamAdminService ;
import ma.sir.note.service.facade.admin.StudentAdminService ;


import java.util.List;
@Service
public class ExamGradeAdminServiceImpl extends AbstractServiceImpl<ExamGrade,ExamGradeHistory, ExamGradeCriteria, ExamGradeHistoryCriteria, ExamGradeDao,
ExamGradeHistoryDao> implements ExamGradeAdminService {



    public List<ExamGrade> findByExamId(Long id){
        return dao.findByExamId(id);
    }
    public int deleteByExamId(Long id){
        return dao.deleteByExamId(id);
    }
    public List<ExamGrade> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }



    public void configure() {
        super.configure(ExamGrade.class,ExamGradeHistory.class, ExamGradeHistoryCriteria.class, ExamGradeSpecification.class);
    }

    @Autowired
    private ExamAdminService examService ;
    @Autowired
    private StudentAdminService studentService ;

    public ExamGradeAdminServiceImpl(ExamGradeDao dao, ExamGradeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}