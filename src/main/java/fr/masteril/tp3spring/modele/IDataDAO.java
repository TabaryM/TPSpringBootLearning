package fr.masteril.tp3spring.modele;

import java.util.List;

public interface IDataDAO {
    List<Data> findAll();
    Data findById(int id);
    void save(Data data);
    void delete(int id);
}
