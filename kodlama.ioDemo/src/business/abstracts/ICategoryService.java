package business.abstracts;

import entities.concrets.Category;

public interface ICategoryService {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}
