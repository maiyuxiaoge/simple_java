package service;

public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;

    //Employee  :  10, id, name, age, salary
    //Programmer:  11, id, name, age, salary
    //Designer  :  12, id, name, age, salary, bonus
    //Architect :  13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
        {"10", "1", "MY", "22", "3000"},
        {"13", "2", "MH", "32", "18000", "15000", "2000"},
        {"11", "3", "LY", "23", "7000"},
        {"11", "4", "LQ", "24", "7300"},
        {"12", "5", "LJ", "28", "10000", "5000"},
        {"11", "6", "RZ", "22", "6800"},
        {"12", "7", "LC", "29", "10800","5200"},
        {"13", "8", "YY", "30", "19800", "15000", "2500"},
        {"12", "9", "SY", "26", "9800", "5500"},
        {"11", "10", "DL", "21", "6600"},
        {"11", "11", "ZC", "25", "7100"},
        {"12", "12", "YZ", "27", "9600", "4800"}
    };
    
    //如下的EQUIPMENTS数组与上面的EMPLOYEES数组元素一一对应
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, name, type 
    public static final String[][] EQUIPMENTS = {
        {},
        {"22", "DELLT4", "6000"},
        {"21", "DELL", "NEC17\'"},
        {"21", "DELL", "Samsung 17\'"},
        {"23", "Canon 2900", "Laser"},
        {"21", "ASUS", "Samsung 17\'"},
        {"21", "ASUS", "Samsung 17\'"},
        {"23", "EPSON20K", "needle"},
        {"22", "HPm6", "5800"},
        {"21", "DELL", "NEC 17\'"},
        {"21", "HP","Samsung 17\'"},
        {"22", "HPm6", "5800"}
    };
}
