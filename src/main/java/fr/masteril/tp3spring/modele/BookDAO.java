package fr.masteril.tp3spring.modele;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDAO implements IDataDAO{
    private final List<Data> books;

    public BookDAO() {
        books = new ArrayList<>();
    }

    @Override
    public List<Data> findAll() {
        return List.copyOf(books);
    }

    @Override
    public Data findById(int id) {
        Data res = null;
        for (Data data : books) {
            if(data.getId() == id){
                res = data;
                break;
            }
        }
        return res;
    }

    @Override
    public void save(Data data) {
        assert (data.getClass() == Book.class): "Error : Data type incorrect, please only add Books";
        books.add(data);
    }

    @Override
    public void delete(int id) {
        Data d = null;
        for (Data data : books) {
            if(data.getId() == id){
                d = data;
                break;
            }
        }
        books.remove(d);
    }
}
