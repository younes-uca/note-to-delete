package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.ModuleGrade;
import ma.sir.pmp.dao.criteria.core.ModuleGradeCriteria;
import ma.sir.pmp.dao.criteria.history.ModuleGradeHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;

import ma.sir.pmp.ws.dto.ModuleGradeDto;
import org.springframework.http.HttpEntity;

public interface ModuleGradeAdminService extends  IService<ModuleGrade,ModuleGradeCriteria, ModuleGradeHistoryCriteria>  {

    List<ModuleGrade> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<ModuleGrade> findByModuleId(Long id);
    int deleteByModuleId(Long id);
    List<ModuleGrade> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

    HttpEntity<byte[]> createPdf(ModuleGradeDto dto) throws Exception;


}
