package service;

import domain.*;

import static service.Data.*;

/*
 *
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @author lei hang
 * @version 1.0
 * @Date 2022/5/19 20:44
 *
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取employee基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stocks;
            switch (type){
                case EMPLOYEE -> employees[i] = new Employee(id,name,age,salary);
                case PROGRAMMER -> {
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                }
                case DESIGNER -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                }
                case ARCHITECT -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stocks = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stocks);
                }
            }
        }
    }

    private Equipment createEquipment(int index){
       int key =  Integer.parseInt(EQIPMENTS[index][0]);
        String model = EQIPMENTS[index][1];

       switch (key){
           case PC :
               String display = EQIPMENTS[index][2];
               return new PC(model,display);

           case NOTEBOOK:
               double price = Double.parseDouble(EQIPMENTS[index][2]);
               return new NoteBook(model,price);

           case PRINTER:
               String name = EQIPMENTS[index][1];
               String type = EQIPMENTS[index][2];
               return new Printer(name,type);

       }
        return null;
    }

    public Employee[] getAllEmployee() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0;i<employees.length;i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到对应id的人员");
    }

}
