package com.pos.astra.repository;

import com.pos.astra.model.MstRole;

import java.util.List;

public interface MstRoleDao {
    public List<MstRole> getAll();
    public MstRole getById(int id);
}
