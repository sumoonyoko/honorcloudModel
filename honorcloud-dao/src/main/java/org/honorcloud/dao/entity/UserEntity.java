package org.honorcloud.dao.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserEntity implements Serializable {

    private String uid;

    private String openid;

    private String name;
   
    private String image; //头像
    
    private String username;

    private String passwore;

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid='" + uid + '\'' +
                
                ", openid='" + openid + '\'' +
                ", name='" + name + '\'' +
               
                ", image='" + image + '\'' +
                '}';
    }
}
