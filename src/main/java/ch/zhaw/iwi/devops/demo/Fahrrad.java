package ch.zhaw.iwi.devops.demo;

public class Fahrrad {
    private int id;
    private String name;
    private String hersteller;

    public Fahrrad(int id, String name, String hersteller) {
        this.id = id;
        this.name = name;
        this.hersteller = hersteller;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHersteller() {
        return hersteller;
    }
}
