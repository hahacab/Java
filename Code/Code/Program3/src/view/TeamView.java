package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

public class TeamView {
    private NameListService listService = new NameListService();
    private TeamService teamService =new TeamService();

    public void enterMainMenu(){
	boolean exitFlag = true;
	char menu = 0;
	while (exitFlag){
	    if (menu != '1'){
		listAllEmployee();
	    }

	    System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4): ");
	    menu = TSUtility.readMenuSelection();
	    switch (menu){
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

		    System.out.println("确认是否退出（Y/N）");
		    char isExit = TSUtility.readConfirmSelection();
		    if (isExit == 'Y') exitFlag = false;
		    break;

	    }
	}
    }

    private void listAllEmployee(){
	System.out.println("------------------------开发团队调度软件----------------------------\n");
	Employee[] employees = listService.getAllEmployee();
	if ( employees == null || employees.length == 0) System.out.println("公司没有任何员工信息");
	else {
	    System.out.println("ID \t姓名 \t年龄 \t工资 \t职位 \t状态 \t奖金 \t股票 \t领用设备");
	    for (Employee employee : employees) {
		System.out.println(employee);
	    }
	}
    }

    private void getTeam(){
	System.out.println("------------------------团队成员列表----------------------------\n");
	System.out.println("--------------------------------------------------------------");
	Programmer[] team = teamService.getTeam();
	if (team == null||team.length == 0) System.out.println("团队中没有成员");
	else {
	    System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
	    for (int i =0;i<team.length;i++){
		System.out.println(team[i].getDescription());
	    }
	}
	System.out.println("--------------------------------------------------------------");
    }

    private void addMember(){
	System.out.println("----------------------------添加成员------------------------------");
	System.out.println("请输入添加成员的id");
	int id = TSUtility.readInt();
	try {
	    Employee employee = listService.getEmployee(id);
	    teamService.addMember(listService.getEmployee(id));
	    System.out.println("添加成功");
	    TSUtility.readReturn();
	}catch (TeamException e){
	    System.out.println("添加失败，原因"+e.getMessage());
	    TSUtility.readReturn();
	}

    }

    private void deleteMember(){
	Employee[] employees = listService.getAllEmployee();
	System.out.println("----------------------------删除成员------------------------------");
	System.out.println("请输入删除团队成员的TID");
	try {
	    int id = TSUtility.readInt();
	    teamService.removeMember(id);
	    System.out.println("删除成功");
	    TSUtility.readReturn();
	}catch (TeamException e){
	    System.out.println("删除失败，原因"+e.getMessage());
	    TSUtility.readReturn();
	}
    }

    public static void main(String[] args) {

	TeamView teamView =new TeamView();
	teamView.enterMainMenu();

    }
}
