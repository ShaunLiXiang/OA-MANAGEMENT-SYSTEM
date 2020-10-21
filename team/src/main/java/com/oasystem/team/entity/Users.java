package com.oasystem.team.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 十一组
 * @since 2020-10-21
 */
@Data//getter and setter方法
@NoArgsConstructor //无参
@AllArgsConstructor //全参
public class Users implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String psw;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 外键（部门编号）
     */
    private Integer pid;

    /**
     * 头像
     */
    private String path;


}
