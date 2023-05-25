package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.note.bean.history.DiplomaHistory;


public class DiplomaHistorySpecification extends AbstractHistorySpecification<DiplomaHistoryCriteria, DiplomaHistory> {

    public DiplomaHistorySpecification(DiplomaHistoryCriteria criteria) {
        super(criteria);
    }

    public DiplomaHistorySpecification(DiplomaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
