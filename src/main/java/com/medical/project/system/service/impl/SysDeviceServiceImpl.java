package com.medical.project.system.service.impl;

import java.util.List;
import com.medical.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medical.project.system.mapper.SysDeviceMapper;
import com.medical.project.system.domain.SysDevice;
import com.medical.project.system.service.ISysDeviceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Service
public class SysDeviceServiceImpl implements ISysDeviceService 
{
    @Autowired
    private SysDeviceMapper sysDeviceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysDevice selectSysDeviceById(Long id)
    {
        return sysDeviceMapper.selectSysDeviceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysDevice> selectSysDeviceList(SysDevice sysDevice)
    {
        return sysDeviceMapper.selectSysDeviceList(sysDevice);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysDevice(SysDevice sysDevice)
    {
        sysDevice.setCreateTime(DateUtils.getNowDate());
        return sysDeviceMapper.insertSysDevice(sysDevice);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysDevice(SysDevice sysDevice)
    {
        return sysDeviceMapper.updateSysDevice(sysDevice);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceByIds(Long[] ids)
    {
        return sysDeviceMapper.deleteSysDeviceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceById(Long id)
    {
        return sysDeviceMapper.deleteSysDeviceById(id);
    }
}
