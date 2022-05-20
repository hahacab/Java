package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

public class TeamService {
    private static int counter = 1;
    private int memberId;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;
    public TeamService(){
        super();
    }
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i=0;i<team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee employee){
        if (total>=MAX_MEMBER)throw new TeamException("团队成员不能超过5人");
        if (!(employee instanceof Programmer programmer))throw new TeamException("团队成员必须是开发人员");
        if (isExist(employee))throw new TeamException("团队中已有该成员");
        if (((Programmer) employee).getStatus().equals(Status.BUSY))throw new TeamException("该成员为其他团队的成员");
        if (((Programmer) employee).getStatus().equals(Status.VOCATION))throw new TeamException("该成员在度假");
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i=0;i<total;i++){
            if (team[i] instanceof Architect) numOfArch++;
            else if (team[i] instanceof Designer) numOfDes++;
            else numOfPro++;
        }
        if (employee instanceof Architect){
            if (numOfArch ==1) throw new TeamException("架构师不得超过1人");
        }
        else if (employee instanceof Designer){
            if (numOfDes == 2) throw new TeamException("设计师不得超过2人");
        }
        else {
            if (numOfPro == 3) throw new TeamException("程序员不得超过3人");
        }
        team[total++] = (Programmer)employee;
        programmer.setStatus(Status.BUSY);
        programmer.setMemberId(counter++);

    }
    private boolean isExist(Employee employee){
        for (int i=0;i<total;i++){
            if (team[i].getId() == employee.getId())
                return true;
        }
        return false;
    }

    public void removeMember(int memberId){
        int i;
        for (i=0;i<total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i==total){
            throw new TeamException("没有找到对应memberId的团队成员");
        }

        for (int j=i;j<total;j++){
            team[j] = team[j+1];
        }
        team[total--] = null;
    }
}
