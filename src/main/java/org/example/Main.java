package org.example;

import org.example.enums.Plan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Healthplan healthplan = new Healthplan(1,"A Sigorta", Plan.ADVANCE);
        Healthplan healthplan2 = new Healthplan(2, "B Sigorta", Plan.MEDIUM);
        Healthplan healthplan3 = new Healthplan(3, "C Sigorta", Plan.BASIC);


        String[] healthPlans = {healthplan.getName(), healthplan2.getName(), healthplan3.getName()};

        Employee employee = new Employee(1,"Hakan", "hakan@gmail.com","1234",healthPlans);




        String[] developerNames = {"Hakan", "Hamza", "Batuhan", "Arda",null};

        Company company = new Company(1,"Unravel", 500000, developerNames);


        System.out.println(healthplan.toString());
        System.out.println("************");
        System.out.println(employee.toString());
        System.out.println("************");
        System.out.println(company.toString());


        company.addEmployee(4,"Caner");
        company.addEmployee(5,"Irmak");
        System.out.println(Arrays.toString(developerNames));

        System.out.println(Arrays.toString(employee.getHealthPlans()));

    }
}