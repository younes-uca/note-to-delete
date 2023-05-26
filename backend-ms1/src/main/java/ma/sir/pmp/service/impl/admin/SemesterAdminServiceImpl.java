package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.Semester;
import ma.sir.pmp.bean.history.SemesterHistory;
import ma.sir.pmp.dao.criteria.core.SemesterCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterHistoryCriteria;
import ma.sir.pmp.dao.facade.core.SemesterDao;
import ma.sir.pmp.dao.facade.history.SemesterHistoryDao;
import ma.sir.pmp.dao.specification.core.SemesterSpecification;
import ma.sir.pmp.service.facade.admin.SemesterAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.pmp.bean.core.SemesterModule;

import ma.sir.pmp.service.facade.admin.TrainingAdminService ;
import ma.sir.pmp.service.facade.admin.SemesterModuleAdminService ;


import java.util.List;
@Service
public class SemesterAdminServiceImpl extends AbstractServiceImpl<Semester,SemesterHistory, SemesterCriteria, SemesterHistoryCriteria, SemesterDao,
SemesterHistoryDao> implements SemesterAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Semester create(Semester t) {
        super.create(t);
        if (t.getSemesterModules() != null) {
                t.getSemesterModules().forEach(element-> {
                    element.setSemester(t);
                    semesterModuleService.create(element);
            });
        }
        return t;
    }

    public Semester findWithAssociatedLists(Long id){
        Semester result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSemesterModules(semesterModuleService.findBySemesterId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        semesterModuleService.deleteBySemesterId(id);
    }


    public void updateWithAssociatedLists(Semester semester){
    if(semester !=null && semester.getId() != null){
            List<List<SemesterModule>> resultSemesterModules= semesterModuleService.getToBeSavedAndToBeDeleted(semesterModuleService.findBySemesterId(semester.getId()),semester.getSemesterModules());
            semesterModuleService.delete(resultSemesterModules.get(1));
            ListUtil.emptyIfNull(resultSemesterModules.get(0)).forEach(e -> e.setSemester(semester));
            semesterModuleService.update(resultSemesterModules.get(0),true);
    }
    }

    public Semester findByReferenceEntity(Semester t){
        return  dao.findByCode(t.getCode());
    }

    public List<Semester> findByTrainingId(Long id){
        return dao.findByTrainingId(id);
    }
    public int deleteByTrainingId(Long id){
        return dao.deleteByTrainingId(id);
    }



    public void configure() {
        super.configure(Semester.class,SemesterHistory.class, SemesterHistoryCriteria.class, SemesterSpecification.class);
    }

    @Autowired
    private TrainingAdminService trainingService ;
    @Autowired
    private SemesterModuleAdminService semesterModuleService ;

    public SemesterAdminServiceImpl(SemesterDao dao, SemesterHistoryDao historyDao) {
        super(dao, historyDao);
    }

}