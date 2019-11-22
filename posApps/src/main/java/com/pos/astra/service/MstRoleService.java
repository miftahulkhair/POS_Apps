package com.pos.astra.service;

import com.pos.astra.model.MstRole;

import java.util.List;

public interface MstRoleService {
    public List<MstRole> getAllRole();
    public MstRole getRoleById(int id);
}
