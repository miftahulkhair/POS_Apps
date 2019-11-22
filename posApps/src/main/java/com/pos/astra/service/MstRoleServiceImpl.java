package com.pos.astra.service;

import com.pos.astra.model.MstRole;
import com.pos.astra.repository.MstRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MstRoleServiceImpl implements MstRoleService {

    @Autowired
    MstRoleDao mstRoleDao;

    @Override
    public List<MstRole> getAllRole() {
        return this.mstRoleDao.getAll();
    }

    @Override
    public MstRole getRoleById(int id) {
        return this.mstRoleDao.getById(id);
    }
}
