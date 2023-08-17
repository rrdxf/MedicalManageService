package com.medical.project.system.domain;

import com.medical.framework.aspectj.lang.annotation.Excel;
import com.medical.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 sys_device
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
public class SysDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 租金/月 */
    @Excel(name = "租金/月")
    private Long rentPerMonth;

    /** 押金 */
    @Excel(name = "押金")
    private Long deposit;

    /** 图片 */
    @Excel(name = "图片")
    private String picture;

    /** 热点 用于推荐 */
    @Excel(name = "热点 用于推荐")
    private Long hots;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setRentPerMonth(Long rentPerMonth) 
    {
        this.rentPerMonth = rentPerMonth;
    }

    public Long getRentPerMonth() 
    {
        return rentPerMonth;
    }
    public void setDeposit(Long deposit) 
    {
        this.deposit = deposit;
    }

    public Long getDeposit() 
    {
        return deposit;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setHots(Long hots) 
    {
        this.hots = hots;
    }

    public Long getHots() 
    {
        return hots;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("rentPerMonth", getRentPerMonth())
            .append("createTime", getCreateTime())
            .append("deposit", getDeposit())
            .append("picture", getPicture())
            .append("hots", getHots())
            .toString();
    }
}
