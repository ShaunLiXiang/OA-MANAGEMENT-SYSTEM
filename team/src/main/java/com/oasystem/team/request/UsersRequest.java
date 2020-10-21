package com.oasystem.team.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *  封装请求参数
 * @author 十一组
 * @since 2020-10-21
 */
@Data//getter and setter方法
@NoArgsConstructor //无参
@AllArgsConstructor //全参
public class UsersRequest implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id = 1;

    /**
     * 真实姓名
     */
    private String realname = "明明";

    /**
     * 用户名
     */
    private String name = "admin";

    /**
     * 密码
     */
    private String psw = "admin";

    /**
     * 员工性别
     */
    private String sex = "M";

    /**
     * 外键（部门编号）
     */
    private Integer pid = 1;

    /**
     * 头像
     */
    private String path ="小明小明";


}
