package ma.sir.pmp.service.impl.admin;

import ma.sir.pmp.bean.core.SemesterAverage;
import ma.sir.pmp.bean.history.SemesterAverageHistory;
import ma.sir.pmp.dao.criteria.core.SemesterAverageCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.pmp.dao.facade.core.SemesterAverageDao;
import ma.sir.pmp.dao.facade.history.SemesterAverageHistoryDao;
import ma.sir.pmp.dao.specification.core.SemesterAverageSpecification;
import ma.sir.pmp.service.facade.admin.SemesterAverageAdminService;
import ma.sir.pmp.zynerator.service.AbstractServiceImpl;
import ma.sir.pmp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.pmp.zynerator.util.VelocityPdf;
import ma.sir.pmp.ws.dto.SemesterAverageDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.pmp.service.facade.admin.SemesterAdminService ;
import ma.sir.pmp.service.facade.admin.StudentAdminService ;


import java.util.List;
@Service
public class SemesterAverageAdminServiceImpl extends AbstractServiceImpl<SemesterAverage,SemesterAverageHistory, SemesterAverageCriteria, SemesterAverageHistoryCriteria, SemesterAverageDao,
SemesterAverageHistoryDao> implements SemesterAverageAdminService {
    public static final String TEMPLATE = "template/semesterAverage.vm";
    public static final String FILE_NAME = "semesterAverage.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(SemesterAverageDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<SemesterAverage> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }
    public List<SemesterAverage> findBySemesterId(Long id){
        return dao.findBySemesterId(id);
    }
    public int deleteBySemesterId(Long id){
        return dao.deleteBySemesterId(id);
    }



    public void configure() {
        super.configure(SemesterAverage.class,SemesterAverageHistory.class, SemesterAverageHistoryCriteria.class, SemesterAverageSpecification.class);
    }

    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private StudentAdminService studentService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public SemesterAverageAdminServiceImpl(SemesterAverageDao dao, SemesterAverageHistoryDao historyDao) {
        super(dao, historyDao);
    }

}