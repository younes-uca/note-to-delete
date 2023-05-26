package  ma.sir.pmp.ws.dto;

import ma.sir.pmp.zynerator.audit.Log;
import ma.sir.pmp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainingDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private Integer duration  = 0 ;
    private BigDecimal trainingCost  ;

    private StudentDto student ;



    public TrainingDto(){
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
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }

    @Log
    public BigDecimal getTrainingCost(){
        return this.trainingCost;
    }
    public void setTrainingCost(BigDecimal trainingCost){
        this.trainingCost = trainingCost;
    }


    public StudentDto getStudent(){
        return this.student;
    }

    public void setStudent(StudentDto student){
        this.student = student;
    }




}
