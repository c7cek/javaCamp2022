package dataAccess.concrets.jdbcRepository;

import entities.concrets.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    List<Category> categories =new ArrayList<>();

    public void add(Category category) {
        categories.add(category);
        System.out.println("Category added with JDBC" + category.getId());
    }

    public void delete(Category category) {
        categories.remove(category);
        System.out.println("Category deleted with JDBC" + category.getId());
    }

    public void update(Category category) {
        System.out.println("Category updated with JDBC" + category.getId());
    }
//    public Category get(int id){
//
//    }
    public List<Category> getAll(){
        System.out.println("All categories listed");
        return categories;
    }
}
