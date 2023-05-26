package  ma.sir.pmp.ws.dto;

import ma.sir.pmp.zynerator.audit.Log;
import ma.sir.pmp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SemesterDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String startDate ;
    private String endDate ;

    private TrainingDto training ;

    private List<SemesterModuleDto> semesterModules ;


    public SemesterDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getStartDate(){
        return this.startDate;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getEndDate(){
        return this.endDate;
    }
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }


    public TrainingDto getTraining(){
        return this.training;
    }

    public void setTraining(TrainingDto training){
        this.training = training;
    }



    public List<SemesterModuleDto> getSemesterModules(){
        return this.semesterModules;
    }

    public void setSemesterModules(List<SemesterModuleDto> semesterModules){
        this.semesterModules = semesterModules;
    }

}
