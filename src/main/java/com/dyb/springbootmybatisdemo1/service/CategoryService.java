package com.dyb.springbootmybatisdemo1.service;

import com.dyb.springbootmybatisdemo1.entity.Category;

public interface CategoryService {
    Category findCategoryById(int id);
}
