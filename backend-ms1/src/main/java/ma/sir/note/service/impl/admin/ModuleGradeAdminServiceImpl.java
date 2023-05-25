package ma.sir.note.service.impl.admin;

import ma.sir.note.bean.core.ModuleGrade;
import ma.sir.note.bean.history.ModuleGradeHistory;
import ma.sir.note.dao.criteria.core.ModuleGradeCriteria;
import ma.sir.note.dao.criteria.history.ModuleGradeHistoryCriteria;
import ma.sir.note.dao.facade.core.ModuleGradeDao;
import ma.sir.note.dao.facade.history.ModuleGradeHistoryDao;
import ma.sir.note.dao.specification.core.ModuleGradeSpecification;
import ma.sir.note.service.facade.admin.ModuleGradeAdminService;
import ma.sir.note.zynerator.service.AbstractServiceImpl;
import ma.sir.note.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.note.zynerator.util.VelocityPdf;
import ma.sir.note.ws.dto.ModuleGradeDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.note.service.facade.admin.StudentAdminService ;
import ma.sir.note.service.facade.admin.SemesterAdminService ;
import ma.sir.note.service.facade.admin.ModuleAdminService ;


import java.util.List;
@Service
public class ModuleGradeAdminServiceImpl extends AbstractServiceImpl<ModuleGrade,ModuleGradeHistory, ModuleGradeCriteria, ModuleGradeHistoryCriteria, ModuleGradeDao,
ModuleGradeHistoryDao> implements ModuleGradeAdminService {
    public static final String TEMPLATE = "template/moduleGrade.vm";
    public static final String FILE_NAME = "moduleGrade.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ModuleGradeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<ModuleGrade> findByStudentId(Long id){
        return dao.findByStudentId(id);
    }
    public int deleteByStudentId(Long id){
        return dao.deleteByStudentId(id);
    }
    public List<ModuleGrade> findByModuleId(Long id){
        return dao.findByModuleId(id);
    }
    public int deleteByModuleId(Long id){
        return dao.deleteByModuleId(id);
    }
    public List<ModuleGrade> findBySemesterId(Long id){
        return dao.findBySemesterId(id);
    }
    public int deleteBySemesterId(Long id){
        return dao.deleteBySemesterId(id);
    }



    public void configure() {
        super.configure(ModuleGrade.class,ModuleGradeHistory.class, ModuleGradeHistoryCriteria.class, ModuleGradeSpecification.class);
    }

    @Autowired
    private StudentAdminService studentService ;
    @Autowired
    private SemesterAdminService semesterService ;
    @Autowired
    private ModuleAdminService moduleService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public ModuleGradeAdminServiceImpl(ModuleGradeDao dao, ModuleGradeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}