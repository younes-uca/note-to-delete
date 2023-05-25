package  ma.sir.note.ws.dto;

import ma.sir.note.zynerator.audit.Log;
import ma.sir.note.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class SemesterModuleDto  extends AuditBaseDto {


    private ModuleDto module ;
    private SemesterDto semester ;



    public SemesterModuleDto(){
        super();
    }




    public ModuleDto getModule(){
        return this.module;
    }

    public void setModule(ModuleDto module){
        this.module = module;
    }
    public SemesterDto getSemester(){
        return this.semester;
    }

    public void setSemester(SemesterDto semester){
        this.semester = semester;
    }




}
