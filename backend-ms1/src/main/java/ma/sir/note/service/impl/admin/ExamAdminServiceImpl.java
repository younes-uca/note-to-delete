package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.Exam;
import ma.sir.note.bean.history.ExamHistory;
import ma.sir.note.dao.criteria.core.ExamCriteria;
import ma.sir.note.dao.criteria.history.ExamHistoryCriteria;
import ma.sir.note.dao.facade.core.ExamDao;
import ma.sir.note.dao.facade.history.ExamHistoryDao;
import ma.sir.note.dao.specification.core.ExamSpecification;
import ma.sir.note.service.facade.admin.ExamAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.note.bean.core.ExamGrade;

import ma.sir.note.service.facade.admin.SemesterAdminService ;
import ma.sir.note.service.facade.admin.ModuleAdminService ;
import ma.sir.note.service.facade.admin.ExamGradeAdminService ;


import java.util.List;
@Service
public class ExamAdminServiceImpl extends AbstractServiceImpl<Exam,ExamHistory, ExamCriteria, ExamHistoryCriteria, ExamDao,
ExamHistoryDao> implements ExamAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Exam create(Exam t) {
        super.create(t);
        if (t.getExamGrades() != null) {
                t.getExamGrades().forEach(element-> {
                    element.setExam(t);
                    examGradeService.create(element);
            });
        }
        return t;
    }

    public Exam findWithAssociatedLists(Long id){
        Exam result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setExamGrades(examGradeService.findByExamId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        examGradeService.deleteByExamId(id);
    }


    public void updateWithAssociatedLists(Exam exam){
    if(exam !=null && exam.getId() != null){
            List<List<ExamGrade>> resultExamGrades= examGradeService.getToBeSavedAndToBeDeleted(examGradeService.findByExamId(exam.getId()),exam.getExamGrades());
            examGradeService.delete(resultExamGrades.get(1));
            ListUtil.emptyIfNull(resultExamGrades.get(0)).forEach(e -> e.setExam(exam));
            examGradeService.update(resultExamGrades.get(0),true);
    }
    }


    public List<Exam> findByModuleId(Long id){
        return dao.findByModuleId(id);
    }
    public int deleteByModuleId(Long id){
        return dao.deleteByModuleId(id);
    }
    public List<Exam> findBySemesterId(Long id){
        return dao.findBySemesterId(id);
    }
    public int deleteBySemesterId(Long id){
        return dao.deleteBySemesterId(id);
    }



    public void configure() {
        super.configure(Exam.class,ExamHistory.class, ExamHistoryCriteria.class, ExamSpecification.class);
    }

    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private ModuleAdminService moduleService ;
    @Autowired
    private ExamGradeAdminService examGradeService ;

    public ExamAdminServiceImpl(ExamDao dao, ExamHistoryDao historyDao) {
        super(dao, historyDao);
    }

}