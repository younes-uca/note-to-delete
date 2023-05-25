package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.Training;
import ma.sir.note.bean.history.TrainingHistory;
import ma.sir.note.dao.criteria.core.TrainingCriteria;
import ma.sir.note.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.note.dao.facade.core.TrainingDao;
import ma.sir.note.dao.facade.history.TrainingHistoryDao;
import ma.sir.note.dao.specification.core.TrainingSpecification;
import ma.sir.note.service.facade.admin.TrainingAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.StudentAdminService ;


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