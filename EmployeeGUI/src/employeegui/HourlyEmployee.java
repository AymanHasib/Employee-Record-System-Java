
package employeegui;

public class HourlyEmployee extends Employee{
	double hourlyRate,hourWorked;

	public HourlyEmployee(String name, String id, String designation, double hourlyRate, double hourWorked) {
		super(name, id, designation);
		this.hourlyRate = hourlyRate;
		this.hourWorked = hourWorked;
	}

    

	double getSalary(int hWorked)
	{
		 return hWorked * hourlyRate ;
		 
	}
	
	@Override
	void increaseSalary(double amt) {
            try{if(hourlyRate+amt > 500){
//			throw new InvalidSalaryException("Hourly rate can not be more than 500");
		}

		else {
			hourlyRate += amt;
		}}
		
                catch(Exception e){
           System.out.println(e);
       }
	}
	@Override
	double getSalary()
	{
		return hourWorked * hourlyRate ;
	}
        @Override
        String display()
	{
                
		String s="Name: "+getName()+"   Id: "+getId()+"   Designation: "+getDesignation()+"   Salary: "+this.getSalary()+"\n";
		return s;
	}
}

