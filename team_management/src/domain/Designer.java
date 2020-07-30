package domain;

public class Designer extends Programmer{
    private double bonus;
    private final String position = "DSGN";
    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getDescription(String position) {
        return super.getDescription(position)+"\t"+bonus;
    }

    @Override
    public String toString() {
        return getDescription(position) + "\t\t\t"+getEquipment().getDescription();
    }
}
