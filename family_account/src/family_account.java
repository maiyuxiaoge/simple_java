import javax.sound.midi.Soundbank;
import javax.swing.plaf.TreeUI;
import java.security.KeyStore;

public class family_account {
    public static void main(String[] args) {
        boolean loopFlag = true;
        int balance = 10000;
        String details = "type\tbalance\tamount\texplanation\n";
        while (loopFlag){
            System.out.println("------------------family_account------------------");
            System.out.println("1. detail");
            System.out.println("2. add income");
            System.out.println("3. add expense");
            System.out.println("4. quit");
            char c = Utility.readMenuSelection();
            int amount;
            String explanation;

            switch (c){
                case '1':
                    System.out.println("------------------current_detail------------------");
                    System.out.print(details);
                    break;
                case '2':
                    System.out.print("please input the income amount:  ");
                    amount = Utility.readNumber();
                    balance += amount;
                    System.out.print("please input the income explanation:  ");
                    explanation = Utility.readString();
                    details += "income\t" + balance +"\t" + amount + "\t\t" + explanation +"\n";
                    System.out.println("finished");
                    break;
                case '3':
                    System.out.print("please input the expense amount:  ");
                    amount = Utility.readNumber();
                    balance -= amount;
                    System.out.print("please input the expense explanation:  ");
                    explanation = Utility.readString();
                    details += "expense\t" + balance +"\t" + amount + "\t\t" + explanation +"\n";
                    System.out.println("finished");
                    break;
                case '4':
                    System.out.println("Y/N?");
                    c = Utility.readConfirmSelection();
                    if (c == 'Y') {
                        loopFlag = false;
                    }
                    break;


            }
        }
    }
}
