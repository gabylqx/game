package com.lqx.dao.gameInfo.model;

import java.math.BigDecimal;

/**
 * @author 李其璇
 * @date 2019-11-12 15:28:24
 * @email http://cg.lazy-monkey.com
 */

public class GameInfo {

    private Integer id;
    
    // 游戏名字
    private String name;
    
    // 分类
    private String type;
    
    // 描述
    private String describe;
    
    // 价格
    private BigDecimal price;
    
    // 状态 1有效 0无效
    private String flag;
    
    // 主图/头像
    private String picture;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe){
        this.describe = describe;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

}