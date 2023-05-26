package ma.sir.pmp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.pmp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "training")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="training_seq",sequenceName="training_seq",allocationSize=1, initialValue = 1)
public class Training   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private Integer duration = 0;
    private BigDecimal trainingCost = BigDecimal.ZERO;

    private Student student ;
    


    public Training(){
        super();
    }

    public Training(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="training_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }
    public BigDecimal getTrainingCost(){
        return this.trainingCost;
    }
    public void setTrainingCost(BigDecimal trainingCost){
        this.trainingCost = trainingCost;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Student getStudent(){
        return this.student;
    }
    public void setStudent(Student student){
        this.student = student;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Training training = (Training) o;
        return id != null && id.equals(training.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

