package  ma.sir.pmp.dao.criteria.core;


import ma.sir.pmp.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PaymentCriteria extends  BaseCriteria  {

    private String amount;
    private String amountMin;
    private String amountMax;
    private LocalDateTime paidDate;
    private LocalDateTime paidDateFrom;
    private LocalDateTime paidDateTo;

    private StudentCriteria student ;
    private List<StudentCriteria> students ;
    private TrainingCriteria training ;
    private List<TrainingCriteria> trainings ;
    private SemesterCriteria semester ;
    private List<SemesterCriteria> semesters ;


    public PaymentCriteria(){}

    public String getAmount(){
        return this.amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }   
    public String getAmountMin(){
        return this.amountMin;
    }
    public void setAmountMin(String amountMin){
        this.amountMin = amountMin;
    }
    public String getAmountMax(){
        return this.amountMax;
    }
    public void setAmountMax(String amountMax){
        this.amountMax = amountMax;
    }
      
    public LocalDateTime getPaidDate(){
        return this.paidDate;
    }
    public void setPaidDate(LocalDateTime paidDate){
        this.paidDate = paidDate;
    }
    public LocalDateTime getPaidDateFrom(){
        return this.paidDateFrom;
    }
    public void setPaidDateFrom(LocalDateTime paidDateFrom){
        this.paidDateFrom = paidDateFrom;
    }
    public LocalDateTime getPaidDateTo(){
        return this.paidDateTo;
    }
    public void setPaidDateTo(LocalDateTime paidDateTo){
        this.paidDateTo = paidDateTo;
    }

    public StudentCriteria getStudent(){
        return this.student;
    }

    public void setStudent(StudentCriteria student){
        this.student = student;
    }
    public List<StudentCriteria> getStudents(){
        return this.students;
    }

    public void setStudents(List<StudentCriteria> students){
        this.students = students;
    }
    public TrainingCriteria getTraining(){
        return this.training;
    }

    public void setTraining(TrainingCriteria training){
        this.training = training;
    }
    public List<TrainingCriteria> getTrainings(){
        return this.trainings;
    }

    public void setTrainings(List<TrainingCriteria> trainings){
        this.trainings = trainings;
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
