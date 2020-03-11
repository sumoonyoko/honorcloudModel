package org.honorcloud.service.user.impl;

import org.honorcloud.dao.entity.UserEntity;
import org.honorcloud.dao.user.UserDao;
import org.honorcloud.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Override
    public UserEntity getOpenid(String openid) {
        return userDao.getOpenid(openid);
    }

	@Override
	public int insertQQ(UserEntity userEntity) {
		return userDao.insertQQ(userEntity);
	}

	@Override
	public int updateQQ(UserEntity userEntity) {
		return userDao.updateQQ(userEntity);
	}
}
