package ma.sir.pmp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.bean.core.Student;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentDao extends AbstractRepository<Student,Long>  {

    List<Student> findByDiplomaId(Long id);
    int deleteByDiplomaId(Long id);

    @Query("SELECT NEW Student(item.id,item.cin) FROM Student item")
    List<Student> findAllOptimized();
}
