package fr.masteril.tp3spring.modele;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDAO implements IBookDAO {
    private final List<Book> books;

    public BookDAO() {
        books = new ArrayList<>();
    }

    @Override
    public List<Book> findAll() {
        return List.copyOf(books);
    }

    @Override
    public Book findById(int id) {
        Book res = null;
        for (Book data : books) {
            if(data.getId() == id) res = data;
        }
        return res;
    }

    @Override
    public void save(Book data) {
        assert (data.getClass() == Book.class): "Error : Data type incorrect, please only add Books";
        books.add(data);
    }

    @Override
    public void delete(int id) {
        List<Book> booksCopy = List.copyOf(books);
        for(Book b : booksCopy) {
            if (b.getId() == id) books.remove(b);
        }
    }

    @Override
    public void update(int id, Book book) {
        for(Book b : books) {
            if(b.getId() == id) b.update(book);
        }
    }
}
