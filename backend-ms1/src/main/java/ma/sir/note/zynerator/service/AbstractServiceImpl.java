package ma.sir.note.zynerator.service;

import ma.sir.note.zynerator.audit.AuditBusinessObject;
import ma.sir.note.zynerator.criteria.BaseCriteria;
import ma.sir.note.zynerator.dto.AuditEntityDto;
import ma.sir.note.zynerator.exception.EntityNotFoundException;
import ma.sir.note.zynerator.history.HistBusinessObject;
import ma.sir.note.zynerator.history.HistCriteria;
import ma.sir.note.zynerator.repository.AbstractHistoryRepository;
import ma.sir.note.zynerator.repository.AbstractRepository;
import ma.sir.note.zynerator.security.bean.User;
import ma.sir.note.zynerator.security.service.facade.UserService;
import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.zynerator.specification.AbstractSpecification;
import ma.sir.note.zynerator.util.ListUtil;
import ma.sir.note.zynerator.util.RefelexivityUtil;
import ma.sir.note.zynerator.util.StringUtil;
import ma.sir.note.zynerator.util.Utils;

import ma.sir.note.zynerator.util.FileUtils;
import ma.sir.note.zynerator.util.MD5Checksum;
import ma.sir.note