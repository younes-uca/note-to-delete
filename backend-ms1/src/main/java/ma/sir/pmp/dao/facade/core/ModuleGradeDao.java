package ma.sir.pmp.dao.facade.core;

import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.bean.core.ModuleGrade;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ModuleGradeDao extends AbstractRepository<ModuleGrade,Long>  {

    List<ModuleGrade> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<ModuleGrade> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<ModuleGrade> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

}
