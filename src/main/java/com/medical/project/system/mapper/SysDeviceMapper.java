package com.medical.project.system.mapper;

import java.util.List;
import com.medical.project.system.domain.SysDevice;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
public interface SysDeviceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysDevice selectSysDeviceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    public int insertSysDevice(SysDevice sysDevice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    public int updateSysDevice(SysDevice sysDevice);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysDeviceById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysDeviceByIds(Long[] ids);
}
