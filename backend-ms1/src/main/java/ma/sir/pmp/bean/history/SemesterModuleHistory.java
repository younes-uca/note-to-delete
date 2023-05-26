package ma.sir.pmp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.pmp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "semester_module")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="semester_module_seq",sequenceName="semester_module_seq",allocationSize=1, initialValue = 1)
public class SemesterModuleHistory extends HistBusinessObject  {


    public SemesterModuleHistory() {
    super();
    }

    public SemesterModuleHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="semester_module_seq")
    public Long getId() {
    return id;
    }
}

