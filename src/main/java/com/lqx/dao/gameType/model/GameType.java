package com.game.dao.gameType.model;

import java.math.BigDecimal;

/**
 * @author 李其璇
 * @date 2019-11-12 15:28:24
 * @email http://cg.lazy-monkey.com
 */
public class GameType {

    private Integer id;
    
    // 分类名称
    private String name;
    
    // 分类描述
    private String describe;
    
    // 是否有效 1有效 0无效
    private String flag;
    
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe){
        this.describe = describe;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

}