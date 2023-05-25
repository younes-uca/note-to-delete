package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.Diploma;
import ma.sir.note.bean.history.DiplomaHistory;
import ma.sir.note.dao.criteria.core.DiplomaCriteria;
import ma.sir.note.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.note.dao.facade.core.DiplomaDao;
import ma.sir.note.dao.facade.history.DiplomaHistoryDao;
import ma.sir.note.dao.specification.core.DiplomaSpecification;
import ma.sir.note.service.facade.admin.DiplomaAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.StudentAdminService ;
import ma.sir.note.service.facade.admin.TrainingAdminService ;


import java.util.List;
@Service
public class DiplomaAdminServiceImpl extends AbstractServiceImpl<Diploma,DiplomaHistory, DiplomaCriteria, DiplomaHistoryCriteria, DiplomaDao,
DiplomaHistoryDao> implements DiplomaAdminService {



    public List<Diploma> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }
    public List<Diploma> findByTrainingId(Long id){
        return dao.findByTrainingId(id);
    }
    public int deleteByTrainingId(Long id){
        return dao.deleteByTrainingId(id);
    }



    public void configure() {
        super.configure(Diploma.class,DiplomaHistory.class, DiplomaHistoryCriteria.class, DiplomaSpecification.class);
    }

    @Autowired
    private StudentAdminService studentService ;
    @Autowired
    private TrainingAdminService trainingService ;

    public DiplomaAdminServiceImpl(DiplomaDao dao, DiplomaHistoryDao historyDao) {
        super(dao, historyDao);
    }

}