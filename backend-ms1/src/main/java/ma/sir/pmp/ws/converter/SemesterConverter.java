package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.pmp.zynerator.util.ListUtil;


import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.SemesterHistory;
import ma.sir.pmp.bean.core.Semester;
import ma.sir.pmp.ws.dto.SemesterDto;

@Component
public class SemesterConverter extends AbstractConverter<Semester, SemesterDto, SemesterHistory> {

    @Autowired
    private ModuleConverter moduleConverter ;
    @Autowired
    private TrainingConverter trainingConverter ;
    @Autowired
    private SemesterModuleConverter semesterModuleConverter ;
    private boolean training;
    private boolean semesterModules;

    public  SemesterConverter(){
        super(Semester.class, SemesterDto.class, SemesterHistory.class);
        init(true);
    }

    @Override
    public Semester toItem(SemesterDto dto) {
        if (dto == null) {
            return null;
        } else {
        Semester item = new Semester();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getStartDate()))
                item.setStartDate(DateUtil.stringEnToDate(dto.getStartDate()));
            if(StringUtil.isNotEmpty(dto.getEndDate()))
                item.setEndDate(DateUtil.stringEnToDate(dto.getEndDate()));
            if(this.training && dto.getTraining()!=null)
                item.setTraining(trainingConverter.toItem(dto.getTraining())) ;


            if(this.semesterModules && ListUtil.isNotEmpty(dto.getSemesterModules()))
                item.setSemesterModules(semesterModuleConverter.toItem(dto.getSemesterModules()));

        return item;
        }
    }

    @Override
    public SemesterDto toDto(Semester item) {
        if (item == null) {
            return null;
        } else {
            SemesterDto dto = new SemesterDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getStartDate()!=null)
                dto.setStartDate(DateUtil.dateTimeToString(item.getStartDate()));
            if(item.getEndDate()!=null)
                dto.setEndDate(DateUtil.dateTimeToString(item.getEndDate()));
        if(this.training && item.getTraining()!=null) {
            dto.setTraining(trainingConverter.toDto(item.getTraining())) ;
        }
        if(this.semesterModules && ListUtil.isNotEmpty(item.getSemesterModules())){
            semesterModuleConverter.init(true);
            semesterModuleConverter.setSemester(false);
            dto.setSemesterModules(semesterModuleConverter.toDto(item.getSemesterModules()));
            semesterModuleConverter.setSemester(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.semesterModules = value;
    }

    public void initObject(boolean value) {
        this.training = value;
    }


    public ModuleConverter getModuleConverter(){
        return this.moduleConverter;
    }
    public void setModuleConverter(ModuleConverter moduleConverter ){
        this.moduleConverter = moduleConverter;
    }
    public TrainingConverter getTrainingConverter(){
        return this.trainingConverter;
    }
    public void setTrainingConverter(TrainingConverter trainingConverter ){
        this.trainingConverter = trainingConverter;
    }
    public SemesterModuleConverter getSemesterModuleConverter(){
        return this.semesterModuleConverter;
    }
    public void setSemesterModuleConverter(SemesterModuleConverter semesterModuleConverter ){
        this.semesterModuleConverter = semesterModuleConverter;
    }
    public boolean  isTraining(){
        return this.training;
    }
    public void  setTraining(boolean training){
        this.training = training;
    }
    public boolean  isSemesterModules(){
        return this.semesterModules ;
    }
    public void  setSemesterModules(boolean semesterModules ){
        this.semesterModules  = semesterModules ;
    }
}
