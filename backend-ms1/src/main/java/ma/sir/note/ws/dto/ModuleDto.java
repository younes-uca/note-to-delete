package  ma.sir.note.ws.dto;

import ma.sir.note.zynerator.audit.Log;
import ma.sir.note.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModuleDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public ModuleDto(){
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






}
