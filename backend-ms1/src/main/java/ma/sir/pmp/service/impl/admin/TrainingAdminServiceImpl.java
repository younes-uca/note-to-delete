package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.Training;
import ma.sir.pmp.bean.history.TrainingHistory;
import ma.sir.pmp.dao.criteria.core.TrainingCriteria;
import ma.sir.pmp.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.pmp.dao.facade.core.TrainingDao;
import ma.sir.pmp.dao.facade.history.TrainingHistoryDao;
import ma.sir.pmp.dao.specification.core.TrainingSpecification;
import ma.sir.pmp.service.facade.admin.TrainingAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.StudentAdminService ;


import java.util.List;
@Service
public class TrainingAdminServiceImpl extends AbstractServiceImpl<Training,TrainingHistory, TrainingCriteria, TrainingHistoryCriteria, TrainingDao,
TrainingHistoryDao> implements TrainingAdminService {


    public Training findByReferenceEntity(Training t){
        return  dao.findByCode(t.getCode());
    }

    public List<Training> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }



    public void configure() {
        super.configure(Training.class,TrainingHistory.class, TrainingHistoryCriteria.class, TrainingSpecification.class);
    }

    @Autowired
    private StudentAdminService studentService ;

    public TrainingAdminServiceImpl(TrainingDao dao, TrainingHistoryDao historyDao) {
        super(dao, historyDao);
    }

}