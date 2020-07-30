package domain;

import service.Status;

public class Architect extends Designer{
    private int stock;
    private final String position = "ARCH";

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getDescription(String position) {
        return super.getDescription(position)+"\t"+stock;
    }

    @Override
    public String toString() {
        return getDescription(position) + "\t"+getEquipment().getDescription();
    }
}
