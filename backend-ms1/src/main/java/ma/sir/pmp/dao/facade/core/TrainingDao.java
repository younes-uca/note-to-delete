package ma.sir.pmp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.bean.core.Training;
import org.springframework.stereotype.Repository;
import ma.sir.pmp.bean.core.Training;
import java.util.List;


@Repository
public interface TrainingDao extends AbstractRepository<Training,Long>  {
    Training findByCode(String code);
    int deleteByCode(String code);

    List<Training> findByStudentId(Long id);
    int deleteByStudentId(Long id);

    @Query("SELECT NEW Training(item.id,item.libelle) FROM Training item")
    List<Training> findAllOptimized();
}
