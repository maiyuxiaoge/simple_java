package domain;

import service.Status;

import java.security.Provider;

public class Programmer extends Employee{
    private Status status = Status.FREE;
    private Equipment equipment;
    private final String position = "PROG";

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }



    public String getDescription(String position) {
        return super.getDescription()+"\t"+position+ "\t" + getStatus();
    }

    @Override
    public String toString() {
        return getDescription(position)+"\t\t\t\t\t"+equipment.getDescription();
    }
}
