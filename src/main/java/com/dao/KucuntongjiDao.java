package com.dao;

import com.entity.KucuntongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KucuntongjiVO;
import com.entity.view.KucuntongjiView;


/**
 * 库存统计
 * 
 * @author 
 * @email 
 * @date 2020-11-13 13:46:15
 */
public interface KucuntongjiDao extends BaseMapper<KucuntongjiEntity> {
	
	List<KucuntongjiVO> selectListVO(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
	
	KucuntongjiVO selectVO(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
	
	List<KucuntongjiView> selectListView(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);

	List<KucuntongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
	
	KucuntongjiView selectView(@Param("ew") Wrapper<KucuntongjiEntity> wrapper);
	
}
