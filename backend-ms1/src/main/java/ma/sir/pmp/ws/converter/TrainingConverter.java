package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.pmp.bean.core.Student;

import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.TrainingHistory;
import ma.sir.pmp.bean.core.Training;
import ma.sir.pmp.ws.dto.TrainingDto;

@Component
public class TrainingConverter extends AbstractConverter<Training, TrainingDto, TrainingHistory> {

    @Autowired
    private StudentConverter studentConverter ;
    private boolean student;

    public  TrainingConverter(){
        super(Training.class, TrainingDto.class, TrainingHistory.class);
    }

    @Override
    public Training toItem(TrainingDto dto) {
        if (dto == null) {
            return null;
        } else {
        Training item = new Training();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDuration()))
                item.setDuration(dto.getDuration());
            if(StringUtil.isNotEmpty(dto.getTrainingCost()))
                item.setTrainingCost(dto.getTrainingCost());
            if(dto.getStudent() != null && dto.getStudent().getId() != null){
                item.setStudent(new Student());
                item.getStudent().setId(dto.getStudent().getId());
            }



        return item;
        }
    }

    @Override
    public TrainingDto toDto(Training item) {
        if (item == null) {
            return null;
        } else {
            TrainingDto dto = new TrainingDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDuration()))
                dto.setDuration(item.getDuration());
            if(StringUtil.isNotEmpty(item.getTrainingCost()))
                dto.setTrainingCost(item.getTrainingCost());
        if(this.student && item.getStudent()!=null) {
            dto.setStudent(studentConverter.toDto(item.getStudent())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.student = value;
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
}
