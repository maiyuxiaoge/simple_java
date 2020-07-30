package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

public class TeamView {
    NameListService listSvc = new NameListService();
    TeamService teamSvc = new TeamService();

    private void enterMainMenu() {
        boolean loopflag = true;
        char c;
        listAllEmployees();
        while (loopflag){
            System.out.println("1. getTeam");
            System.out.println("2. addMember");
            System.out.println("3. deleteMember");
            System.out.println("4. quit");
            c = TSUtility.readMenuSelection();
            switch (c){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("Y/N");
                    c = TSUtility.readConfirmSelection();
                    if (c == 'Y'){
                        loopflag = false;
                    }
                    break;
            }
        }

    }
    private void listAllEmployees(){
        System.out.println("ID\tname\tage\tsalary\ttype\tstatus\tbonus\tstock\tequipment");
        for (Employee e:listSvc.getAllEmployees()){
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------");
    }
    private void getTeam(){
        System.out.println("trying to get team");
        System.out.println("ID\tname\tage\tsalary\ttype\tstatus\tbonus\tstock\tequipment");
        for (Programmer p : teamSvc.getTeam()) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------------------");
    }
    private void addMember(){
        System.out.println("which person do you want to add?");
        int i = TSUtility.readInt();
        try {
            Employee e = listSvc.getEmployee(i);
            teamSvc.addMember(e);
        } catch (TeamException teamException) {
            teamException.printStackTrace();
        }
    }
    private void deleteMember() {
        System.out.println("which person do you want to delete");
        int i = TSUtility.readInt();
        try {
            teamSvc.removeMember(i);
        } catch (TeamException teamException) {
            teamException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TeamView tv = new TeamView();
        tv.enterMainMenu();
    }
}
