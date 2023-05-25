package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.Student;
import ma.sir.note.dao.criteria.core.StudentCriteria;
import ma.sir.note.dao.criteria.history.StudentHistoryCriteria;
import ma.sir.note.zynerator.service.IService;


public interface StudentAdminService extends  IService<Student,StudentCriteria, StudentHistoryCriteria>  {

    List<Student> findByDiplomaId(Long id);
    int deleteByDiplomaId(Long id);



}
