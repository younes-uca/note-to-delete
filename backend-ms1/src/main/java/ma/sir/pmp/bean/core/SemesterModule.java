package ma.sir.pmp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.pmp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "semester_module")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="semester_module_seq",sequenceName="semester_module_seq",allocationSize=1, initialValue = 1)
public class SemesterModule   extends AuditBusinessObject     {

    private Long id;


    private Module module ;
    
    private Semester semester ;
    


    public SemesterModule(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="semester_module_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Module getModule(){
        return this.module;
    }
    public void setModule(Module module){
        this.module = module;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Semester getSemester(){
        return this.semester;
    }
    public void setSemester(Semester semester){
        this.semester = semester;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemesterModule semesterModule = (SemesterModule) o;
        return id != null && id.equals(semesterModule.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

