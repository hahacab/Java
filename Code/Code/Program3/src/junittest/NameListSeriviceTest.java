package junittest;

import domain.Employee;
import org.junit.Test;
import service.NameListService;
import service.TeamException;

public class NameListSeriviceTest {
    @Test
    public void testGetAllEmployee(){
        NameListService nameListService =new NameListService();
        Employee[] employees = nameListService.getAllEmployee();
        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService nameListService =new NameListService();
        int id =20;
        try {
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }
}
