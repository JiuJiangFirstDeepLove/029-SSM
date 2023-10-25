package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KucuntongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KucuntongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KucuntongjiView;


/**
 * 库存统计
 *
 * @author 
 * @email 
 * @date 2020-11-13 13:46:15
 */
public interface KucuntongjiService extends IService<KucuntongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KucuntongjiVO> selectListVO(Wrapper<KucuntongjiEntity> wrapper);
   	
   	KucuntongjiVO selectVO(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
   	
   	List<KucuntongjiView> selectListView(Wrapper<KucuntongjiEntity> wrapper);
   	
   	KucuntongjiView selectView(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KucuntongjiEntity> wrapper);
   	
}

