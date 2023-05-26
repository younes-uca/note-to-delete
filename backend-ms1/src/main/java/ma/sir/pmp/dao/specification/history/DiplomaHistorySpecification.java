package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.DiplomaHistoryCriteria;
import ma.sir.pmp.bean.history.DiplomaHistory;


public class DiplomaHistorySpecification extends AbstractHistorySpecification<DiplomaHistoryCriteria, DiplomaHistory> {

    public DiplomaHistorySpecification(DiplomaHistoryCriteria criteria) {
        super(criteria);
    }

    public DiplomaHistorySpecification(DiplomaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
