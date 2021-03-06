package com.mp.blog.shopping.service;

import com.mp.blog.common.service.BaseService;
import com.mp.blog.shopping.entity.RedPacket;

/**
 * @author Administrator
 * @date 2020-07-20 14:28:35
 **/
public interface RedPacketService extends BaseService<RedPacket,Long> {
    /**
     * 根据Tid修改
     * @param redPacket
     * @return
     */
    Boolean updateByTid(RedPacket redPacket);


}
