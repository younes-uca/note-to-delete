package ma.sir.pmp.dao.facade.core;

import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.bean.core.Diploma;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DiplomaDao extends AbstractRepository<Diploma,Long>  {

    List<Diploma> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Diploma> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);

}
