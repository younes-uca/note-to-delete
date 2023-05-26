package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.pmp.bean.core.Student;

import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.DiplomaHistory;
import ma.sir.pmp.bean.core.Diploma;
import ma.sir.pmp.ws.dto.DiplomaDto;

@Component
public class DiplomaConverter extends AbstractConverter<Diploma, DiplomaDto, DiplomaHistory> {

    @Autowired
    private TrainingConverter trainingConverter ;
    @Autowired
    private StudentConverter studentConverter ;
    private boolean student;
    private boolean training;

    public  DiplomaConverter(){
        super(Diploma.class, DiplomaDto.class, DiplomaHistory.class);
    }

    @Override
    public Diploma toItem(DiplomaDto dto) {
        if (dto == null) {
            return null;
        } else {
        Diploma item = new Diploma();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateIssued()))
                item.setDateIssued(DateUtil.stringEnToDate(dto.getDateIssued()));
            if(dto.getStudent() != null && dto.getStudent().getId() != null){
                item.setStudent(new Student());
                item.getStudent().setId(dto.getStudent().getId());
            }

            if(this.training && dto.getTraining()!=null)
                item.setTraining(trainingConverter.toItem(dto.getTraining())) ;



        return item;
        }
    }

    @Override
    public DiplomaDto toDto(Diploma item) {
        if (item == null) {
            return null;
        } else {
            DiplomaDto dto = new DiplomaDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateIssued()!=null)
                dto.setDateIssued(DateUtil.dateTimeToString(item.getDateIssued()));
        if(this.student && item.getStudent()!=null) {
            studentConverter.setDiploma(false);
            dto.setStudent(studentConverter.toDto(item.getStudent())) ;
            studentConverter.setDiploma(true);
        }
        if(this.training && item.getTraining()!=null) {
            dto.setTraining(trainingConverter.toDto(item.getTraining())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.student = value;
        this.training = value;
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
}
