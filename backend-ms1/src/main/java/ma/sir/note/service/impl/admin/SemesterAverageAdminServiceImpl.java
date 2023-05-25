package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.SemesterAverage;
import ma.sir.note.bean.history.SemesterAverageHistory;
import ma.sir.note.dao.criteria.core.SemesterAverageCriteria;
import ma.sir.note.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.note.dao.facade.core.SemesterAverageDao;
import ma.sir.note.dao.facade.history.SemesterAverageHistoryDao;
import ma.sir.note.dao.specification.core.SemesterAverageSpecification;
import ma.sir.note.service.facade.admin.SemesterAverageAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.note.zynerator.util.VelocityPdf;
import ma.sir.note.ws.dto.SemesterAverageDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.StudentAdminService ;
import ma.sir.note.service.facade.admin.SemesterAdminService ;


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
    private StudentAdminService studentService ;
    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public SemesterAverageAdminServiceImpl(SemesterAverageDao dao, SemesterAverageHistoryDao historyDao) {
        super(dao, historyDao);
    }

}