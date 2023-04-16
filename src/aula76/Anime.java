package aula76;

public class Anime {
    private String name;

    @Override
    public String toString() {
        return "Anime{" + "name='" + name + '\'' + '}';
    }

    public Anime(String name) {
        this.name = name;
    }

}
