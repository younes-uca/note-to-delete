package ma.sir.pmp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.pmp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "semester_average")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="semester_average_seq",sequenceName="semester_average_seq",allocationSize=1, initialValue = 1)
public class SemesterAverageHistory extends HistBusinessObject  {


    public SemesterAverageHistory() {
    super();
    }

    public SemesterAverageHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="semester_average_seq")
    public Long getId() {
    return id;
    }
}

