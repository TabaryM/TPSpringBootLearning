package fr.masteril.tp3spring.modele;

import java.util.List;

public interface DataController {
    List<Data> getDatas();
    Data getData(int id);
    void addData(Data data);
    void deleteData(int id);
}
