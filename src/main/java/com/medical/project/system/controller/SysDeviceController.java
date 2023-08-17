package com.medical.project.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.medical.framework.aspectj.lang.annotation.Log;
import com.medical.framework.aspectj.lang.enums.BusinessType;
import com.medical.project.system.domain.SysDevice;
import com.medical.project.system.service.ISysDeviceService;
import com.medical.framework.web.controller.BaseController;
import com.medical.framework.web.domain.AjaxResult;
import com.medical.common.utils.poi.ExcelUtil;
import com.medical.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@RestController
@RequestMapping("/system/device")
public class SysDeviceController extends BaseController
{
    @Autowired
    private ISysDeviceService sysDeviceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:device:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDevice sysDevice)
    {
        startPage();
        List<SysDevice> list = sysDeviceService.selectSysDeviceList(sysDevice);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:device:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysDevice sysDevice)
    {
        List<SysDevice> list = sysDeviceService.selectSysDeviceList(sysDevice);
        ExcelUtil<SysDevice> util = new ExcelUtil<SysDevice>(SysDevice.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:device:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysDeviceService.selectSysDeviceById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:device:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDevice sysDevice)
    {
        return toAjax(sysDeviceService.insertSysDevice(sysDevice));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:device:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDevice sysDevice)
    {
        return toAjax(sysDeviceService.updateSysDevice(sysDevice));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:device:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysDeviceService.deleteSysDeviceByIds(ids));
    }
}
