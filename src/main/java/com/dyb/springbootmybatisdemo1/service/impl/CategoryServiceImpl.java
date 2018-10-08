package com.dyb.springbootmybatisdemo1.service.impl;

import com.dyb.springbootmybatisdemo1.dao.CategoryMapper;
import com.dyb.springbootmybatisdemo1.entity.Category;
import com.dyb.springbootmybatisdemo1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public Category findCategoryById(int id){
        Category category = categoryMapper.selectByPrimaryKey(id);
        return category;
    }
}
