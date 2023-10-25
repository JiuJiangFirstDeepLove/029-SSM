package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KucuntongjiDao;
import com.entity.KucuntongjiEntity;
import com.service.KucuntongjiService;
import com.entity.vo.KucuntongjiVO;
import com.entity.view.KucuntongjiView;

@Service("kucuntongjiService")
public class KucuntongjiServiceImpl extends ServiceImpl<KucuntongjiDao, KucuntongjiEntity> implements KucuntongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KucuntongjiEntity> page = this.selectPage(
                new Query<KucuntongjiEntity>(params).getPage(),
                new EntityWrapper<KucuntongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KucuntongjiEntity> wrapper) {
		  Page<KucuntongjiView> page =new Query<KucuntongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KucuntongjiVO> selectListVO(Wrapper<KucuntongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KucuntongjiVO selectVO(Wrapper<KucuntongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KucuntongjiView> selectListView(Wrapper<KucuntongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KucuntongjiView selectView(Wrapper<KucuntongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
