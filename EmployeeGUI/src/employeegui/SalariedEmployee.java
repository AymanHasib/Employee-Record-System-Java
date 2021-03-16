/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

public class SalariedEmployee extends Employee{
    public double monthlySalary;
    public SalariedEmployee(String name,String id,String designation,double monthlySalary){
        super(name,id,designation);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void increaseSalary(double amt) {

       
        
        try{ 
        if(amt<=0){
//            throw new InvalidSalaryException("Increase amount should be a positive Number.");
        }
        else{
            monthlySalary+=amt;
        }
       }catch(Exception e){
           System.out.println(e);
       }
        
    }

    @Override
    double getSalary() {
        return monthlySalary;
    }

    
    @Override
    String display(){
        String s="Name: "+getName()+"   Id: "+getId()+"   Designation: "+getDesignation()+"   Salary: "+this.getSalary()+"\n";
        return s;
    }
}