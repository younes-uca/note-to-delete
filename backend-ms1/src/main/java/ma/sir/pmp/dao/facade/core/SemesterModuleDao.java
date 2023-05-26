package ma.sir.pmp.dao.facade.core;

import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.bean.core.SemesterModule;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SemesterModuleDao extends AbstractRepository<SemesterModule,Long>  {

    List<SemesterModule> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<SemesterModule> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

}
