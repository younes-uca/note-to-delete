package ma.sir.note.dao.facade.core;

import ma.sir.note.zynerator.repository.AbstractRepository;
import ma.sir.note.bean.core.Diploma;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DiplomaDao extends AbstractRepository<Diploma,Long>  {

    List<Diploma> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<Diploma> findByTrainingId(Long id);
    int deleteByTrainingId(Long id);

}
