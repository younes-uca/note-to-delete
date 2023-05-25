package  ma.sir.note.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.note.zynerator.util.StringUtil;
import ma.sir.note.zynerator.converter.AbstractConverter;
import ma.sir.note.zynerator.util.DateUtil;
import ma.sir.note.bean.history.ModuleHistory;
import ma.sir.note.bean.core.Module;
import ma.sir.note.ws.dto.ModuleDto;

@Component
public class ModuleConverter extends AbstractConverter<Module, ModuleDto, ModuleHistory> {


    public  ModuleConverter(){
        super(Module.class, ModuleDto.class, ModuleHistory.class);
    }

    @Override
    public Module toItem(ModuleDto dto) {
        if (dto == null) {
            return null;
        } else {
        Module item = new Module();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public ModuleDto toDto(Module item) {
        if (item == null) {
            return null;
        } else {
            ModuleDto dto = new ModuleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
