package ma.sir.note.zynerator.service;

import ma.sir.note.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.note.zynerator.criteria.BaseCriteria;
import ma.sir.note.zynerator.history.HistBusinessObject;
import ma.sir.note.zynerator.history.HistCriteria;
import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}