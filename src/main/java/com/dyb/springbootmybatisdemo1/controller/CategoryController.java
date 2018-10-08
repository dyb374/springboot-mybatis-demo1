package com.dyb.springbootmybatisdemo1.controller;

import com.dyb.springbootmybatisdemo1.entity.Category;
import com.dyb.springbootmybatisdemo1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value="/categories/{id}")
    public Category findCategoryById(@PathVariable() Integer id){
        Category category = categoryService.findCategoryById(id);
        return category;
    }
}
