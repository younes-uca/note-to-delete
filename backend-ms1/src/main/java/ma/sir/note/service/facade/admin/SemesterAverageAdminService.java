package ma.sir.note.service.facade.admin;

import java.util.List;
import ma.sir.note.bean.core.SemesterAverage;
import ma.sir.note.dao.criteria.core.SemesterAverageCriteria;
import ma.sir.note.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.note.zynerator.service.IService;

import ma.sir.note.ws.dto.SemesterAverageDto;
import org.springframework.http.HttpEntity;

public interface SemesterAverageAdminService extends  IService<SemesterAverage,SemesterAverageCriteria, SemesterAverageHistoryCriteria>  {

    List<SemesterAverage> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<SemesterAverage> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

    HttpEntity<byte[]> createPdf(SemesterAverageDto dto) throws Exception;


}
