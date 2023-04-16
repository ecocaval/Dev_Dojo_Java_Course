package aula90Polimorfismo.service;

import aula90Polimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in database..");
    }
}
