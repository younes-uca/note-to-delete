package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.PaymentHistoryCriteria;
import ma.sir.pmp.bean.history.PaymentHistory;


public class PaymentHistorySpecification extends AbstractHistorySpecification<PaymentHistoryCriteria, PaymentHistory> {

    public PaymentHistorySpecification(PaymentHistoryCriteria criteria) {
        super(criteria);
    }

    public PaymentHistorySpecification(PaymentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
