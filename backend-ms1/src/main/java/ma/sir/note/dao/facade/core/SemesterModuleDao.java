package ma.sir.note.dao.facade.core;

import ma.sir.note.zynerator.repository.AbstractRepository;
import ma.sir.note.bean.core.SemesterModule;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SemesterModuleDao extends AbstractRepository<SemesterModule,Long>  {

    List<SemesterModule> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<SemesterModule> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

}
