package com.pos.astra.service;

import com.pos.astra.model.MstUser;

import java.util.List;

public interface MstUserService {
    public void saveUser(MstUser mstUser);
    public void updateUser(MstUser mstUser);
    public List<MstUser> getAllUser();
    public MstUser getByUserId(int id);
}
