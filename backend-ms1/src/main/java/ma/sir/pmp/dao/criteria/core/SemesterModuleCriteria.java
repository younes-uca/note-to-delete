package  ma.sir.pmp.dao.criteria.core;


import ma.sir.pmp.zynerator.criteria.BaseCriteria;
import java.util.List;

public class SemesterModuleCriteria extends  BaseCriteria  {


    private ModuleCriteria module ;
    private List<ModuleCriteria> modules ;
    private SemesterCriteria semester ;
    private List<SemesterCriteria> semesters ;


    public SemesterModuleCriteria(){}


    public ModuleCriteria getModule(){
        return this.module;
    }

    public void setModule(ModuleCriteria module){
        this.module = module;
    }
    public List<ModuleCriteria> getModules(){
        return this.modules;
    }

    public void setModules(List<ModuleCriteria> modules){
        this.modules = modules;
    }
    public SemesterCriteria getSemester(){
        return this.semester;
    }

    public void setSemester(SemesterCriteria semester){
        this.semester = semester;
    }
    public List<SemesterCriteria> getSemesters(){
        return this.semesters;
    }

    public void setSemesters(List<SemesterCriteria> semesters){
        this.semesters = semesters;
    }
}
