package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.Salary;

public class Employee {

    public Employee() {
        Salary sal = new Salary();//建立基本薪資物件
        setSalary(sal);
    }

    private Salary salary;
   

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

}
