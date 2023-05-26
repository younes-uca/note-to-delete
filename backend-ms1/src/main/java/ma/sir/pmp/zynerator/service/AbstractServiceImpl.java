package ma.sir.pmp.zynerator.service;

import ma.sir.pmp.zynerator.audit.AuditBusinessObject;
import ma.sir.pmp.zynerator.criteria.BaseCriteria;
import ma.sir.pmp.zynerator.dto.AuditEntityDto;
import ma.sir.pmp.zynerator.exception.EntityNotFoundException;
import ma.sir.pmp.zynerator.history.HistBusinessObject;
import ma.sir.pmp.zynerator.history.HistCriteria;
import ma.sir.pmp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.pmp.zynerator.repository.AbstractRepository;
import ma.sir.pmp.zynerator.security.bean.User;
import ma.sir.pmp.zynerator.security.service.facade.UserService;
import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.zynerator.specification.AbstractSpecification;
import ma.sir.pmp.zynerator.util.ListUtil;
import ma.sir.pmp.zynerator.util.RefelexivityUtil;
import ma.sir.pmp.zynerator.util.StringUtil;
import ma.sir.pmp.zynerator.util.Utils;

import ma.sir.pmp.zynerator.util.FileUtils;
import ma.sir.pmp.zynerator.util.MD5Checksum;
import ma.sir.pmp