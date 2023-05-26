package  ma.sir.pmp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.pmp.bean.core.Student;
import ma.sir.pmp.bean.core.Semester;

import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.converter.AbstractConverter;
import ma.sir.pmp.zynerator.util.DateUtil;
import ma.sir.pmp.bean.history.SemesterAverageHistory;
import ma.sir.pmp.bean.core.SemesterAverage;
import ma.sir.pmp.ws.dto.SemesterAverageDto;

@Component
public class SemesterAverageConverter extends AbstractConverter<SemesterAverage, SemesterAverageDto, SemesterAverageHistory> {

    @Autowired
    private SemesterConverter semesterConverter ;
    @Autowired
    private StudentConverter studentConverter ;
    private boolean student;
    private boolean semester;

    public  SemesterAverageConverter(){
        super(SemesterAverage.class, SemesterAverageDto.class, SemesterAverageHistory.class);
    }

    @Override
    public SemesterAverage toItem(SemesterAverageDto dto) {
        if (dto == null) {
            return null;
        } else {
        SemesterAverage item = new SemesterAverage();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getAverage()))
                item.setAverage(dto.getAverage());
            if(dto.getValidated() != null)
                item.setValidated(dto.getValidated());
            if(dto.getStudent() != null && dto.getStudent().getId() != null){
                item.setStudent(new Student());
                item.getStudent().setId(dto.getStudent().getId());
            }

            if(dto.getSemester() != null && dto.getSemester().getId() != null){
                item.setSemester(new Semester());
                item.getSemester().setId(dto.getSemester().getId());
            }



        return item;
        }
    }

    @Override
    public SemesterAverageDto toDto(SemesterAverage item) {
        if (item == null) {
            return null;
        } else {
            SemesterAverageDto dto = new SemesterAverageDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getAverage()))
                dto.setAverage(item.getAverage());
                dto.setValidated(item.getValidated());
        if(this.student && item.getStudent()!=null) {
            dto.setStudent(studentConverter.toDto(item.getStudent())) ;
        }
        if(this.semester && item.getSemester()!=null) {
            dto.setSemester(semesterConverter.toDto(item.getSemester())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.student = value;
        this.semester = value;
    }


    public SemesterConverter getSemesterConverter(){
        return this.semesterConverter;
    }
    public void setSemesterConverter(SemesterConverter semesterConverter ){
        this.semesterConverter = semesterConverter;
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
    public boolean  isSemester(){
        return this.semester;
    }
    public void  setSemester(boolean semester){
        this.semester = semester;
    }
}
