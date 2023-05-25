package ma.sir.note.dao.facade.history;

import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.bean.history.DiplomaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaHistoryDao extends AbstractHistoryRepository<DiplomaHistory,Long> {

}
