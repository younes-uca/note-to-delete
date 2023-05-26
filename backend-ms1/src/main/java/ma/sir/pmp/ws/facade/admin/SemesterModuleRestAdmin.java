package  ma.sir.pmp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.pmp.bean.core.SemesterModule;
import ma.sir.pmp.bean.history.SemesterModuleHistory;
import ma.sir.pmp.dao.criteria.core.SemesterModuleCriteria;
import ma.sir.pmp.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.pmp.service.facade.admin.SemesterModuleAdminService;
import ma.sir.pmp.ws.converter.SemesterModuleConverter;
import ma.sir.pmp.ws.dto.SemesterModuleDto;
import ma.sir.pmp.zynerator.controller.AbstractController;
import ma.sir.pmp.zynerator.dto.AuditEntityDto;
import ma.sir.pmp.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.pmp.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.pmp.zynerator.dto.FileTempDto;

@Api("Manages semesterModule services")
@RestController
@RequestMapping("/api/admin/semesterModule/")
public class SemesterModuleRestAdmin  extends AbstractController<SemesterModule, SemesterModuleDto, SemesterModuleHistory, SemesterModuleCriteria, SemesterModuleHistoryCriteria, SemesterModuleAdminService, SemesterModuleConverter> {


    @ApiOperation("upload one semesterModule")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple semesterModules")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all semesterModules")
    @GetMapping("")
    public ResponseEntity<List<SemesterModuleDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a semesterModule by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SemesterModuleDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  semesterModule")
    @PostMapping("")
    public ResponseEntity<SemesterModuleDto> save(@RequestBody SemesterModuleDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  semesterModule")
    @PutMapping("")
    public ResponseEntity<SemesterModuleDto> update(@RequestBody SemesterModuleDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of semesterModule")
    @PostMapping("multiple")
    public ResponseEntity<List<SemesterModuleDto>> delete(@RequestBody List<SemesterModuleDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified semesterModule")
    @DeleteMapping("")
    public ResponseEntity<SemesterModuleDto> delete(@RequestBody SemesterModuleDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified semesterModule")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple semesterModules by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by module id")
    @GetMapping("module/id/{id}")
    public List<SemesterModule> findByModuleId(@PathVariable Long id){
        return service.findByModuleId(id);
    }
    @ApiOperation("delete by module id")
    @DeleteMapping("module/id/{id}")
    public int deleteByModuleId(@PathVariable Long id){
        return service.deleteByModuleId(id);
    }
    @ApiOperation("find by semester id")
    @GetMapping("semester/id/{id}")
    public List<SemesterModule> findBySemesterId(@PathVariable Long id){
        return service.findBySemesterId(id);
    }
    @ApiOperation("delete by semester id")
    @DeleteMapping("semester/id/{id}")
    public int deleteBySemesterId(@PathVariable Long id){
        return service.deleteBySemesterId(id);
    }
    @ApiOperation("Finds semesterModules by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SemesterModuleDto>> findByCriteria(@RequestBody SemesterModuleCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated semesterModules by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SemesterModuleCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports semesterModules by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SemesterModuleCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets semesterModule data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SemesterModuleCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets semesterModule history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets semesterModule paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SemesterModuleHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports semesterModule history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SemesterModuleHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets semesterModule history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SemesterModuleHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SemesterModuleRestAdmin (SemesterModuleAdminService service, SemesterModuleConverter converter) {
        super(service, converter);
    }


}