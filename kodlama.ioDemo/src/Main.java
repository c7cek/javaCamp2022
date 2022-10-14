import dataAccess.concrets.jdbcRepository.CategoryDao;
import entities.abstracts.Entity;
import entities.concrets.Category;
import entities.concrets.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category category = new Category(1, "Java");
        Category category1 = new Category(2, "Js");
        Category category2 = new Category(3, "c#");

        CategoryDao categoryDao = new CategoryDao();
        categoryDao.add(category);
        categoryDao.add(category1);
        categoryDao.add(category2);
        categoryDao.delete(category1);

        List<Category> categoryList = categoryDao.getAll();

        for (Category c:categoryList){
            System.out.println(c.getName());
        }
    }
}