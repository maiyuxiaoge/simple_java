package service;

import domain.*;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i=0;i<Data.EMPLOYEES.length;i++){
            String[] employee = Data.EMPLOYEES[i];
//            13, id, name, age, salary, bonus, stock
            int type = Integer.parseInt(employee[0]);
            int id = Integer.parseInt(employee[1]);
            String name = employee[2];
            int age = Integer.parseInt(employee[3]);
            double salary = Double.parseDouble(employee[4]);
            double bonus;
            int stock;
            Equipment equipment;
            switch (type){
                case Data.ARCHITECT:
                    bonus = Double.parseDouble(employee[5]);
                    stock = Integer.parseInt(employee[6]);
                    equipment = getEquipment(i);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
                case Data.DESIGNER:
                    bonus = Double.parseDouble(employee[5]);
                    equipment = getEquipment(i);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case Data.PROGRAMMER:
                    equipment = getEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;

            }


        }

    }
    private Equipment getEquipment(int i){
        int type = Integer.parseInt(Data.EQUIPMENTS[i][0]);
        Equipment eq;
        switch (type){
            case Data.PC:
                eq = new PC(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
                break;
            case Data.NOTEBOOK:
                eq = new NoteBook(Data.EQUIPMENTS[i][1],Double.parseDouble(Data.EQUIPMENTS[i][2]));
                break;
            case Data.PRINTER:
                eq = new Printer(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
                break;
            default:
                eq = null;
        }

        return eq;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id)throws TeamException{
        for (Employee e: employees){
            if (e.getId() == id)
                return e;
        }
        throw new TeamException("not found");
    }
}
