package ma.sir.pmp.service.facade.admin;

import java.util.List;
import ma.sir.pmp.bean.core.SemesterAverage;
import ma.sir.pmp.dao.criteria.core.SemesterAverageCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.pmp.zynerator.service.IService;

import ma.sir.pmp.ws.dto.SemesterAverageDto;
import org.springframework.http.HttpEntity;

public interface SemesterAverageAdminService extends  IService<SemesterAverage,SemesterAverageCriteria, SemesterAverageHistoryCriteria>  {

    List<SemesterAverage> findByStudentId(Long id);
    int deleteByStudentId(Long id);
    List<SemesterAverage> findBySemesterId(Long id);
    int deleteBySemesterId(Long id);

    HttpEntity<byte[]> createPdf(SemesterAverageDto dto) throws Exception;


}
