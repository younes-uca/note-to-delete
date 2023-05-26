package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.Student;
import ma.sir.pmp.dao.criteria.core.StudentCriteria;
import ma.sir.pmp.dao.criteria.history.StudentHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;


public interface StudentAdminService extends  IService<Student,StudentCriteria, StudentHistoryCriteria>  {

    List<Student> findByDiplomaId(Long id);
    int deleteByDiplomaId(Long id);



}
