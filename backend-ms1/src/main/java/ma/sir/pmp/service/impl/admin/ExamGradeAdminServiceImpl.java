package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.ExamGrade;
import ma.sir.pmp.bean.history.ExamGradeHistory;
import ma.sir.pmp.dao.criteria.core.ExamGradeCriteria;
import ma.sir.pmp.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.pmp.dao.facade.core.ExamGradeDao;
import ma.sir.pmp.dao.facade.history.ExamGradeHistoryDao;
import ma.sir.pmp.dao.specification.core.ExamGradeSpecification;
import ma.sir.pmp.service.facade.admin.ExamGradeAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.StudentAdminService ;
import ma.sir.pmp.service.facade.admin.ExamAdminService ;


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
    private StudentAdminService studentService ;
    @Autowired
    private ExamAdminService examService ;

    public ExamGradeAdminServiceImpl(ExamGradeDao dao, ExamGradeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}