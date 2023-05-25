package  ma.sir.note.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.note.zynerator.util.ListUtil;


import ma.sir.note.zynerator.util.StringUtil;
import ma.sir.note.zynerator.converter.AbstractConverter;
import ma.sir.note.zynerator.util.DateUtil;
import ma.sir.note.bean.history.StudentHistory;
import ma.sir.note.bean.core.Student;
import ma.sir.note.ws.dto.StudentDto;

@Component
public class StudentConverter extends AbstractConverter<Student, StudentDto, StudentHistory> {

    @Autowired
    private DiplomaConverter diplomaConverter ;
    @Autowired
    private SemesterConverter semesterConverter ;
    @Autowired
    private SemesterAverageConverter semesterAverageConverter ;
    @Autowired
    private TrainingConverter trainingConverter ;
    @Autowired
    private PaymentConverter paymentConverter ;
    private boolean diploma;
    private boolean semestersAverages;
    private boolean payments;

    public  StudentConverter(){
        super(Student.class, StudentDto.class, StudentHistory.class);
        init(true);
    }

    @Override
    public Student toItem(StudentDto dto) {
        if (dto == null) {
            return null;
        } else {
        Student item = new Student();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getFirstName()))
                item.setFirstName(dto.getFirstName());
            if(StringUtil.isNotEmpty(dto.getLastName()))
                item.setLastName(dto.getLastName());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getPhoneNumber()))
                item.setPhoneNumber(dto.getPhoneNumber());
            if(StringUtil.isNotEmpty(dto.getAddress()))
                item.setAddress(dto.getAddress());
            if(StringUtil.isNotEmpty(dto.getRegistrationDate()))
                item.setRegistrationDate(DateUtil.stringEnToDate(dto.getRegistrationDate()));
            if(dto.getGraduated() != null)
                item.setGraduated(dto.getGraduated());
            if(this.diploma && dto.getDiploma()!=null)
                item.setDiploma(diplomaConverter.toItem(dto.getDiploma())) ;


            if(this.semestersAverages && ListUtil.isNotEmpty(dto.getSemestersAverages()))
                item.setSemestersAverages(semesterAverageConverter.toItem(dto.getSemestersAverages()));
            if(this.payments && ListUtil.isNotEmpty(dto.getPayments()))
                item.setPayments(paymentConverter.toItem(dto.getPayments()));

        return item;
        }
    }

    @Override
    public StudentDto toDto(Student item) {
        if (item == null) {
            return null;
        } else {
            StudentDto dto = new StudentDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getFirstName()))
                dto.setFirstName(item.getFirstName());
            if(StringUtil.isNotEmpty(item.getLastName()))
                dto.setLastName(item.getLastName());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getPhoneNumber()))
                dto.setPhoneNumber(item.getPhoneNumber());
            if(StringUtil.isNotEmpty(item.getAddress()))
                dto.setAddress(item.getAddress());
            if(item.getRegistrationDate()!=null)
                dto.setRegistrationDate(DateUtil.dateTimeToString(item.getRegistrationDate()));
                dto.setGraduated(item.getGraduated());
        if(this.diploma && item.getDiploma()!=null) {
            diplomaConverter.setStudent(false);
            dto.setDiploma(diplomaConverter.toDto(item.getDiploma())) ;
            diplomaConverter.setStudent(true);
        }
        if(this.semestersAverages && ListUtil.isNotEmpty(item.getSemestersAverages())){
            semesterAverageConverter.init(true);
            semesterAverageConverter.setStudent(false);
            dto.setSemestersAverages(semesterAverageConverter.toDto(item.getSemestersAverages()));
            semesterAverageConverter.setStudent(true);

        }
        if(this.payments && ListUtil.isNotEmpty(item.getPayments())){
            paymentConverter.init(true);
            paymentConverter.setStudent(false);
            dto.setPayments(paymentConverter.toDto(item.getPayments()));
            paymentConverter.setStudent(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.semestersAverages = value;
        this.payments = value;
    }

    public void initObject(boolean value) {
        this.diploma = value;
    }


    public DiplomaConverter getDiplomaConverter(){
        return this.diplomaConverter;
    }
    public void setDiplomaConverter(DiplomaConverter diplomaConverter ){
        this.diplomaConverter = diplomaConverter;
    }
    public SemesterConverter getSemesterConverter(){
        return this.semesterConverter;
    }
    public void setSemesterConverter(SemesterConverter semesterConverter ){
        this.semesterConverter = semesterConverter;
    }
    public SemesterAverageConverter getSemesterAverageConverter(){
        return this.semesterAverageConverter;
    }
    public void setSemesterAverageConverter(SemesterAverageConverter semesterAverageConverter ){
        this.semesterAverageConverter = semesterAverageConverter;
    }
    public TrainingConverter getTrainingConverter(){
        return this.trainingConverter;
    }
    public void setTrainingConverter(TrainingConverter trainingConverter ){
        this.trainingConverter = trainingConverter;
    }
    public PaymentConverter getPaymentConverter(){
        return this.paymentConverter;
    }
    public void setPaymentConverter(PaymentConverter paymentConverter ){
        this.paymentConverter = paymentConverter;
    }
    public boolean  isDiploma(){
        return this.diploma;
    }
    public void  setDiploma(boolean diploma){
        this.diploma = diploma;
    }
    public boolean  isSemestersAverages(){
        return this.semestersAverages ;
    }
    public void  setSemestersAverages(boolean semestersAverages ){
        this.semestersAverages  = semestersAverages ;
    }
    public boolean  isPayments(){
        return this.payments ;
    }
    public void  setPayments(boolean payments ){
        this.payments  = payments ;
    }
}
