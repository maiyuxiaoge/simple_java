import javax.sound.midi.Soundbank;
import javax.swing.*;

public class CustomerView {
    private CustomerList customers = new CustomerList(10);
    public void enterMainMenu(){
        boolean enterflag = true;
        while (enterflag){
            System.out.println("-------------Customer_management-------------");
            System.out.println("1. addNewCustomer");
            System.out.println("2. modifyCustomer");
            System.out.println("3. deleteCustomer");
            System.out.println("4. listAllCustomers");
            System.out.println("5. quit");
            char c = CMUtility.readMenuSelection();
            switch (c){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("Y/N?");
                    c = CMUtility.readConfirmSelection();
                    if (c == 'Y'){
                        enterflag = false;
                    }
                    break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("addNewCustomer");
        Customer cust = new Customer();
        boolean flag = customers.addCustomer(cust);
        if (flag){
            System.out.println("name");
            cust.setName(CMUtility.readString(10,"andy"));
            System.out.println("age");
            cust.setAge(CMUtility.readInt(15));
            System.out.println("gender");
            cust.setGender(CMUtility.readChar('M'));
            System.out.println("email");
            cust.setEmail(CMUtility.readString(20,"admin@126.com"));
            System.out.println("phone");
            cust.setPhone(CMUtility.readString(13,"1234567890"));
        }
    }
    private void modifyCustomer(){
        System.out.println("modifyCustomer");
        System.out.println("which customer");
        int num = CMUtility.readInt();
        Customer cust = customers.getCustomer(num);
        if (cust != null){
            System.out.println("name");
            cust.setName(CMUtility.readString(10,"andy"));
            System.out.println("age");
            cust.setAge(CMUtility.readInt(15));
            System.out.println("gender");
            cust.setGender(CMUtility.readChar('M'));
            System.out.println("email");
            cust.setEmail(CMUtility.readString(20,"admin@126.com"));
            System.out.println("phone");
            cust.setPhone(CMUtility.readString(13,"1234567890"));
        }
    }
    private void deleteCustomer(){
        System.out.println("deleteCustomer");
        System.out.println("which customer");
        int num = CMUtility.readInt();
        customers.deleteCustomer(num);

    }
    private void listAllCustomers(){
        System.out.println("all customers");
        Customer[] custs = customers.getAllCustomers();
        System.out.println("name"+"\t"+"gender"+"\t" +"phone"+"\t"+"email"+"\t"+"age");
        for (Customer c: custs){
            System.out.println(c.getName()+"\t"+c.getGender()+"\t"
                                +c.getPhone()+"\t"+c.getEmail()+"\t"+c.getAge());
        }
     }
    public static void main(String[] args){
        CustomerView cv = new CustomerView();
        cv.enterMainMenu();
    }

}
