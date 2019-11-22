package com.pos.astra.service;

import com.pos.astra.model.MstUser;
import com.pos.astra.repository.MstUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstUserServiceImpl implements MstUserService {

    @Autowired
    MstUserDao mstUserDao;


    @Override
    public void saveUser(MstUser mstUser) {
        this.mstUserDao.save(mstUser);
    }

    @Override
    public void updateUser(MstUser mstUser) {
        this.mstUserDao.update(mstUser);
    }

    @Override
    public List<MstUser> getAllUser() {
        return this.mstUserDao.getAll();
    }

    @Override
    public MstUser getByUserId(int id) {
        return this.mstUserDao.getById(id);
    }


}
