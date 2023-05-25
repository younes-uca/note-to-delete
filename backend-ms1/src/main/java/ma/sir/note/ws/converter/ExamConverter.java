package  ma.sir.note.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.note.zynerator.util.ListUtil;

import ma.sir.note.bean.core.Semester;

import ma.sir.note.zynerator.util.StringUtil;
import ma.sir.note.zynerator.converter.AbstractConverter;
import ma.sir.note.zynerator.util.DateUtil;
import ma.sir.note.bean.history.ExamHistory;
import ma.sir.note.bean.core.Exam;
import ma.sir.note.ws.dto.ExamDto;

@Component
public class ExamConverter extends AbstractConverter<Exam, ExamDto, ExamHistory> {

    @Autowired
    private SemesterConverter semesterConverter ;
    @Autowired
    private StudentConverter studentConverter ;
    @Autowired
    private ModuleConverter moduleConverter ;
    @Autowired
    private ExamGradeConverter examGradeConverter ;
    private boolean module;
    private boolean semester;
    private boolean examGrades;

    public  ExamConverter(){
        super(Exam.class, ExamDto.class, ExamHistory.class);
        init(true);
    }

    @Override
    public Exam toItem(ExamDto dto) {
        if (dto == null) {
            return null;
        } else {
        Exam item = new Exam();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateExam()))
                item.setDateExam(DateUtil.stringEnToDate(dto.getDateExam()));
            if(this.module && dto.getModule()!=null)
                item.setModule(moduleConverter.toItem(dto.getModule())) ;

            if(dto.getSemester() != null && dto.getSemester().getId() != null){
                item.setSemester(new Semester());
                item.getSemester().setId(dto.getSemester().getId());
            }


            if(this.examGrades && ListUtil.isNotEmpty(dto.getExamGrades()))
                item.setExamGrades(examGradeConverter.toItem(dto.getExamGrades()));

        return item;
        }
    }

    @Override
    public ExamDto toDto(Exam item) {
        if (item == null) {
            return null;
        } else {
            ExamDto dto = new ExamDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateExam()!=null)
                dto.setDateExam(DateUtil.dateTimeToString(item.getDateExam()));
        if(this.module && item.getModule()!=null) {
            dto.setModule(moduleConverter.toDto(item.getModule())) ;
        }
        if(this.semester && item.getSemester()!=null) {
            dto.setSemester(semesterConverter.toDto(item.getSemester())) ;
        }
        if(this.examGrades && ListUtil.isNotEmpty(item.getExamGrades())){
            examGradeConverter.init(true);
            examGradeConverter.setExam(false);
            dto.setExamGrades(examGradeConverter.toDto(item.getExamGrades()));
            examGradeConverter.setExam(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.examGrades = value;
    }

    public void initObject(boolean value) {
        this.module = value;
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
    public ModuleConverter getModuleConverter(){
        return this.moduleConverter;
    }
    public void setModuleConverter(ModuleConverter moduleConverter ){
        this.moduleConverter = moduleConverter;
    }
    public ExamGradeConverter getExamGradeConverter(){
        return this.examGradeConverter;
    }
    public void setExamGradeConverter(ExamGradeConverter examGradeConverter ){
        this.examGradeConverter = examGradeConverter;
    }
    public boolean  isModule(){
        return this.module;
    }
    public void  setModule(boolean module){
        this.module = module;
    }
    public boolean  isSemester(){
        return this.semester;
    }
    public void  setSemester(boolean semester){
        this.semester = semester;
    }
    public boolean  isExamGrades(){
        return this.examGrades ;
    }
    public void  setExamGrades(boolean examGrades ){
        this.examGrades  = examGrades ;
    }
}
