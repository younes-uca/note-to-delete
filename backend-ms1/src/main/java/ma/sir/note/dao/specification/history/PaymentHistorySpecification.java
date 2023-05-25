package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.PaymentHistoryCriteria;
import ma.sir.note.bean.history.PaymentHistory;


public class PaymentHistorySpecification extends AbstractHistorySpecification<PaymentHistoryCriteria, PaymentHistory> {

    public PaymentHistorySpecification(PaymentHistoryCriteria criteria) {
        super(criteria);
    }

    public PaymentHistorySpecification(PaymentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
