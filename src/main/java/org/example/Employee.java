package org.example;

import java.util.Arrays;

public class Employee {
    private long id;

    private String fullName;

    private String email;

    private String password;

    private  String[] healthPlans;

    public Employee(long id, String fullName, String email, String password,
                    String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0) {
            System.out.println("index değer sıfırdan küçük olamaz!");
        } else {
            try {
                if (healthPlans[index] == null) {
                    this.healthPlans[index] = name;
                } else {
                    System.out.println("ilgili index dolu: " + index);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" catche düştü invalid index: " + index);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
