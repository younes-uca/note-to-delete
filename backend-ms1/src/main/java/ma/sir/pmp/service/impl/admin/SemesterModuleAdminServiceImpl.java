package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.SemesterModule;
import ma.sir.pmp.bean.history.SemesterModuleHistory;
import ma.sir.pmp.dao.criteria.core.SemesterModuleCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.pmp.dao.facade.core.SemesterModuleDao;
import ma.sir.pmp.dao.facade.history.SemesterModuleHistoryDao;
import ma.sir.pmp.dao.specification.core.SemesterModuleSpecification;
import ma.sir.pmp.service.facade.admin.SemesterModuleAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.SemesterAdminService ;
import ma.sir.pmp.service.facade.admin.ModuleAdminService ;


import java.util.List;
@Service
public class SemesterModuleAdminServiceImpl extends AbstractServiceImpl<SemesterModule,SemesterModuleHistory, SemesterModuleCriteria, SemesterModuleHistoryCriteria, SemesterModuleDao,
SemesterModuleHistoryDao> implements SemesterModuleAdminService {



    public List<SemesterModule> findByModuleId(Long id){
        return dao.findByModuleId(id);
    }
    public int deleteByModuleId(Long id){
        return dao.deleteByModuleId(id);
    }
    public List<SemesterModule> findBySemesterId(Long id){
        return dao.findBySemesterId(id);
    }
    public int deleteBySemesterId(Long id){
        return dao.deleteBySemesterId(id);
    }



    public void configure() {
        super.configure(SemesterModule.class,SemesterModuleHistory.class, SemesterModuleHistoryCriteria.class, SemesterModuleSpecification.class);
    }

    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private ModuleAdminService moduleService ;

    public SemesterModuleAdminServiceImpl(SemesterModuleDao dao, SemesterModuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}