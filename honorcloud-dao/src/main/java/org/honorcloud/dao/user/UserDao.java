package org.honorcloud.dao.user;

import org.honorcloud.dao.entity.UserEntity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserDao extends BaseMapper<UserEntity> {

    //通过openid得到用户信息
    UserEntity getOpenid( String openid);
   
  //添加信息
    int insertQQ(UserEntity userEntity);

   //修改信息
    int updateQQ(UserEntity userEntity);

   //QQ授权过之后会给一个openid，通过openid进行查找，如果没有就是首次登陆直接添，如果有先修改信息
 


}
