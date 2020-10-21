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
public class Depart implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 部门编号
     */
    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    /**
     * 部门名称
     */
    private String pname;

    /**
     * 部门备注
     */
    private String premark;
}
