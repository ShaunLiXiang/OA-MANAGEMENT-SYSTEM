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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartRequest implements Serializable {

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
