package aula90Polimorfismo.test;

import aula90Polimorfismo.repository.Repository;
import aula90Polimorfismo.service.ArchiveRepository;
import aula90Polimorfismo.service.DatabaseRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new ArchiveRepository();
        repository.save();
    }
}
