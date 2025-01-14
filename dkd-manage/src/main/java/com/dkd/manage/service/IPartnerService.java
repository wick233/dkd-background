package com.dkd.manage.service;

import java.util.List;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.vo.PartnerVo;

/**
 * 合作商管理Service接口
 * 
 * @author kang
 * @date 2024-06-30
 */
public interface IPartnerService 
{
    /**
     * 查询合作商管理
     * 
     * @param id 合作商管理主键
     * @return 合作商管理
     */
    public Partner selectPartnerById(Long id);

    /**
     * 查询合作商管理列表
     * 
     * @param partner 合作商管理
     * @return 合作商管理集合
     */
    public List<Partner> selectPartnerList(Partner partner);

    /**
     * 新增合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    public int insertPartner(Partner partner);

    /**
     * 修改合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    public int updatePartner(Partner partner);

    /**
     * 批量删除合作商管理
     * 
     * @param ids 需要删除的合作商管理主键集合
     * @return 结果
     */
    public int deletePartnerByIds(Long[] ids);

    /**
     * 删除合作商管理信息
     * 
     * @param id 合作商管理主键
     * @return 结果
     */
    public int deletePartnerById(Long id);

    /**
     * 查询合作商管理列表
     *
     * @param partner 合作商管理
     * @return 合作商管理集合
     */
    public List<PartnerVo> selectPartneryVo(Partner partner);

    /**
     * 删除指定ID的重置密码记录。
     *
     * @param partner 需要删除的重置密码记录对应的用户ID。
     * @return 成功删除记录的数量，正常情况下为1表示成功，0表示没有找到对应记录。
     */
    public int resetPwd(Partner partner);

}
