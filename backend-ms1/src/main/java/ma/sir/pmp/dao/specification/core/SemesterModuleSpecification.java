package  ma.sir.pmp.dao.specification.core;

import ma.sir.pmp.zynerator.specification.AbstractSpecification;
import ma.sir.pmp.dao.criteria.core.SemesterModuleCriteria;
import ma.sir.pmp.bean.core.SemesterModule;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SemesterModuleSpecification extends  AbstractSpecification<SemesterModuleCriteria, SemesterModule>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("module","id", criteria.getModule()==null?null:criteria.getModule().getId());
        addPredicateFk("module","id", criteria.getModules());
        addPredicateFk("module","code", criteria.getModule()==null?null:criteria.getModule().getCode());
        addPredicateFk("semester","id", criteria.getSemester()==null?null:criteria.getSemester().getId());
        addPredicateFk("semester","id", criteria.getSemesters());
        addPredicateFk("semester","code", criteria.getSemester()==null?null:criteria.getSemester().getCode());
    }

    public SemesterModuleSpecification(SemesterModuleCriteria criteria) {
        super(criteria);
    }

    public SemesterModuleSpecification(SemesterModuleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
