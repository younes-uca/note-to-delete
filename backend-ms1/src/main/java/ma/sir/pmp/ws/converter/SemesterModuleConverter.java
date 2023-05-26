package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.pmp.bean.core.Semester;

import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.SemesterModuleHistory;
import ma.sir.pmp.bean.core.SemesterModule;
import ma.sir.pmp.ws.dto.SemesterModuleDto;

@Component
public class SemesterModuleConverter extends AbstractConverter<SemesterModule, SemesterModuleDto, SemesterModuleHistory> {

    @Autowired
    private SemesterConverter semesterConverter ;
    @Autowired
    private ModuleConverter moduleConverter ;
    private boolean module;
    private boolean semester;

    public  SemesterModuleConverter(){
        super(SemesterModule.class, SemesterModuleDto.class, SemesterModuleHistory.class);
    }

    @Override
    public SemesterModule toItem(SemesterModuleDto dto) {
        if (dto == null) {
            return null;
        } else {
        SemesterModule item = new SemesterModule();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(this.module && dto.getModule()!=null)
                item.setModule(moduleConverter.toItem(dto.getModule())) ;

            if(dto.getSemester() != null && dto.getSemester().getId() != null){
                item.setSemester(new Semester());
                item.getSemester().setId(dto.getSemester().getId());
            }



        return item;
        }
    }

    @Override
    public SemesterModuleDto toDto(SemesterModule item) {
        if (item == null) {
            return null;
        } else {
            SemesterModuleDto dto = new SemesterModuleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.module && item.getModule()!=null) {
            dto.setModule(moduleConverter.toDto(item.getModule())) ;
        }
        if(this.semester && item.getSemester()!=null) {
            dto.setSemester(semesterConverter.toDto(item.getSemester())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.module = value;
        this.semester = value;
    }


    public SemesterConverter getSemesterConverter(){
        return this.semesterConverter;
    }
    public void setSemesterConverter(SemesterConverter semesterConverter ){
        this.semesterConverter = semesterConverter;
    }
    public ModuleConverter getModuleConverter(){
        return this.moduleConverter;
    }
    public void setModuleConverter(ModuleConverter moduleConverter ){
        this.moduleConverter = moduleConverter;
    }
    public boolean  isModule(){
        return this.module;
    }
    public void  setModule(boolean module){
        this.module = module;
    }
    public boolean  isSemester(){
        return this.semester;
    }
    public void  setSemester(boolean semester){
        this.semester = semester;
    }
}
