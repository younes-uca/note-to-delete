package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.Diploma;
import ma.sir.pmp.bean.history.DiplomaHistory;
import ma.sir.pmp.dao.criteria.core.DiplomaCriteria;
import ma.sir.pmp.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.pmp.dao.facade.core.DiplomaDao;
import ma.sir.pmp.dao.facade.history.DiplomaHistoryDao;
import ma.sir.pmp.dao.specification.core.DiplomaSpecification;
import ma.sir.pmp.service.facade.admin.DiplomaAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.TrainingAdminService ;
import ma.sir.pmp.service.facade.admin.StudentAdminService ;


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
    private TrainingAdminService trainingService ;
    @Autowired
    private StudentAdminService studentService ;

    public DiplomaAdminServiceImpl(DiplomaDao dao, DiplomaHistoryDao historyDao) {
        super(dao, historyDao);
    }

}