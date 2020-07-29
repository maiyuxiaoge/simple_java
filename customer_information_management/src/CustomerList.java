import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.security.KeyStore;
import java.security.cert.TrustAnchor;
import java.util.Arrays;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if (total == customers.length){
            System.out.println("Failure! Too may costomers");
            return false;
        }else{
            customers[total] = customer;
            total += 1;
            System.out.println("Success! added");
            return true;
        }
    }
    public boolean replaceCustomer(int index, Customer cust){
        if (index<0 || index>=total){
            System.out.println("Failure! not enough customers");
            return false;
        }else{
            customers[index] = cust;
            System.out.println("Success! replaced");
            return true;
        }
    }
    public boolean deleteCustomer(int index){
        if (index<0 || index>=total){
            System.out.println("Failure! not enough customers");
            return false;
        }else{
            for (int i = index;i<customers.length-1;i++){
                customers[i] = customers[i+1];
            }
            customers[customers.length-1] = null;
            System.out.println("Success! Deleted");
            total -=1;
            return true;
        }
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i=0;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if (index<0 || index>=total){
            System.out.println("Failure! not enough customers");
            return null;
        }else{
            System.out.println("Success! find");
            return customers[index];
        }
    }
    public int getTotal(){
        return total;
    }

}
