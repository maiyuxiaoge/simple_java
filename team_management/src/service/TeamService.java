package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

import java.time.temporal.Temporal;

public class TeamService {
    private final int  MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;
    private int numOfArch = 0;
    private int numOfDsgn = 0;
    private int numOfPrg = 0;

    public Programmer[] getTeam(){
        Programmer[] t = new Programmer[total];
        for (int i =0;i<total;i++){
            t[i] = team[i];
        }
        return t;
    }
    public void addMember(Employee e) throws TeamException{
        if (total == MAX_MEMBER){
            throw new TeamException("full list");
        }
        if (! (e instanceof Programmer)){
            throw  new TeamException("Not a programmer");
        }

        Programmer p = (Programmer) e;

        for (int i = 0; i < total; i++){
            if (team[i].getId() == p.getId()){
                throw new TeamException("Already Exist");
            }
        }
        if (!(p.getStatus().getNAME().equals("FREE"))){
            throw new TeamException("Not available");
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1){
                throw new TeamException("too many architect");
            }
            else{
                numOfArch += 1;
            }
        } else if (p instanceof Designer) {
            if (numOfDsgn >= 2){
                throw new TeamException("too many designer");
            }
            else{
                numOfDsgn += 1;
            }
        } else if (p instanceof Programmer) {
            if (numOfPrg >= 3){
                throw new TeamException("too many programmer");
            }
            else{
                numOfPrg += 1;
            }
        }
        p.setStatus(Status.BUSY);
        team[total] = p;
        total += 1;



    }

    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        while (i<total){
            if (team[i].getId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
            i += 1;
        }
        if (i == total){
            throw new TeamException("member not found");
        }
        if (team[i] instanceof Architect) {
                numOfArch -= 1;
        } else if (team[i] instanceof Designer) {
                numOfDsgn -= 1;
        } else if (team[i] instanceof Programmer) {
                numOfPrg -= 1;
        }
        for (;i<MAX_MEMBER-1;i++){
            team[i] = team[i+1];
        }
        team[MAX_MEMBER-1] = null;
        total -= 1;

    }
}
