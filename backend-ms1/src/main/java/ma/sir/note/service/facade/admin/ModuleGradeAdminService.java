package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.ModuleGrade;
import ma.sir.note.dao.criteria.core.ModuleGradeCriteria;
import ma.sir.note.dao.criteria.history.ModuleGradeHistoryCriteria;
import ma.sir.note.zynerator.service.IService;

import ma.sir.note.ws.dto.ModuleGradeDto;
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
