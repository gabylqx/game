package com.game.dao.user.model;

import java.math.BigDecimal;
import java.sql.Time;

/**
 * @author 李其璇
 * @date 2019-11-12 15:28:24
 * @email http://cg.lazy-monkey.com
 */
public class User {

    private Integer id;
    
    // 昵称
    private String nickname;
    
    // 性别 保密：0  男：1 女：2
    private Boolean sex;
    
    private String email;
    
    private String phone;
    
    private String token;
    
    // 注册ip
    private String registerIp;
    
    // 注册时间
    private Date registerDate;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex){
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp){
        this.registerIp = registerIp;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate){
        this.registerDate = registerDate;
    }

}