package ir.parto.libmng.module.books.model.service;

import ir.parto.libmng.module.books.model.entity.Category;
import ir.parto.libmng.module.books.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category){
        return this.categoryRepository.save(category);
    }

    public Category updateCategory(Category category){
        return this.categoryRepository.save(category);
    }

    public void deleteCategory(Category category){
        this.categoryRepository.delete(category);
    }

    public List<Category> findAllCategory(){
        return this.categoryRepository.findAll();
    }

    public Category findOneCategory(Long id){
        return this.categoryRepository.getOne(id);
    }
}
