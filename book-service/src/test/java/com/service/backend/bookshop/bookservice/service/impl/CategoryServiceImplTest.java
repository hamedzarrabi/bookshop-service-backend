package com.service.backend.bookshop.bookservice.service.impl;

import com.service.backend.bookshop.bookservice.dto.CategoryDto;
import com.service.backend.bookshop.bookservice.repository.CategoryRepository;
import com.service.backend.bookshop.bookservice.service.CategoryService;
import com.service.backend.bookshop.common.entity.book.Category;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static com.service.backend.bookshop.bookservice.mapper.CategoryMapper.mapToEntity;
import static org.assertj.core.api.Assertions.assertThat;



@ContextConfiguration(classes = {CategoryRepository.class})
@SpringBootTest
class CategoryServiceImplTest {
    @Autowired private CategoryRepository categoryRepository;

    @Test
    void createCategory() {
        CategoryDto category = new CategoryDto(UUID.randomUUID(), "programing", "learn programing");
        System.out.println(category.toString());
        Category saveCategory = mapToEntity(category);
        System.out.println(saveCategory.getCategoryId() + "--" + saveCategory.getTitle() + "--" + saveCategory.getDescription());
        Category save = categoryRepository.save(saveCategory);
        assertThat(save.getCategoryId()).isGreaterThan(UUID.randomUUID());
    }

    @Test
    void updateCategory() {
    }

    @Test
    void finAllCategory() {
    }

    @Test
    void findCategoryById() {
    }

    @Test
    void deleteCategory() {
    }
}