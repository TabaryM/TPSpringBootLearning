package fr.masteril.tp3spring.modele;

import java.util.List;

public interface IBookDAO {
    List<Book> findAll();
    Book findById(int id);
    void save(Book data);
    void delete(int id);
    void update(int id, Book book);
}
