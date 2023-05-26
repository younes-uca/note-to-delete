package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.pmp.bean.core.Student;
import ma.sir.pmp.bean.core.Semester;

import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.PaymentHistory;
import ma.sir.pmp.bean.core.Payment;
import ma.sir.pmp.ws.dto.PaymentDto;

@Component
public class PaymentConverter extends AbstractConverter<Payment, PaymentDto, PaymentHistory> {

    @Autowired
    private SemesterConverter semesterConverter ;
    @Autowired
    private TrainingConverter trainingConverter ;
    @Autowired
    private StudentConverter studentConverter ;
    private boolean student;
    private boolean training;
    private boolean semester;

    public  PaymentConverter(){
        super(Payment.class, PaymentDto.class, PaymentHistory.class);
    }

    @Override
    public Payment toItem(PaymentDto dto) {
        if (dto == null) {
            return null;
        } else {
        Payment item = new Payment();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getAmount()))
                item.setAmount(dto.getAmount());
            if(StringUtil.isNotEmpty(dto.getPaidDate()))
                item.setPaidDate(DateUtil.stringEnToDate(dto.getPaidDate()));
            if(dto.getStudent() != null && dto.getStudent().getId() != null){
                item.setStudent(new Student());
                item.getStudent().setId(dto.getStudent().getId());
            }

            if(this.training && dto.getTraining()!=null)
                item.setTraining(trainingConverter.toItem(dto.getTraining())) ;

            if(dto.getSemester() != null && dto.getSemester().getId() != null){
                item.setSemester(new Semester());
                item.getSemester().setId(dto.getSemester().getId());
            }



        return item;
        }
    }

    @Override
    public PaymentDto toDto(Payment item) {
        if (item == null) {
            return null;
        } else {
            PaymentDto dto = new PaymentDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getAmount()))
                dto.setAmount(item.getAmount());
            if(item.getPaidDate()!=null)
                dto.setPaidDate(DateUtil.dateTimeToString(item.getPaidDate()));
        if(this.student && item.getStudent()!=null) {
            dto.setStudent(studentConverter.toDto(item.getStudent())) ;
        }
        if(this.training && item.getTraining()!=null) {
            dto.setTraining(trainingConverter.toDto(item.getTraining())) ;
        }
        if(this.semester && item.getSemester()!=null) {
            dto.setSemester(semesterConverter.toDto(item.getSemester())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.student = value;
        this.training = value;
        this.semester = value;
    }


    public SemesterConverter getSemesterConverter(){
        return this.semesterConverter;
    }
    public void setSemesterConverter(SemesterConverter semesterConverter ){
        this.semesterConverter = semesterConverter;
    }
    public TrainingConverter getTrainingConverter(){
        return this.trainingConverter;
    }
    public void setTrainingConverter(TrainingConverter trainingConverter ){
        this.trainingConverter = trainingConverter;
    }
    public StudentConverter getStudentConverter(){
        return this.studentConverter;
    }
    public void setStudentConverter(StudentConverter studentConverter ){
        this.studentConverter = studentConverter;
    }
    public boolean  isStudent(){
        return this.student;
    }
    public void  setStudent(boolean student){
        this.student = student;
    }
    public boolean  isTraining(){
        return this.training;
    }
    public void  setTraining(boolean training){
        this.training = training;
    }
    public boolean  isSemester(){
        return this.semester;
    }
    public void  setSemester(boolean semester){
        this.semester = semester;
    }
}
