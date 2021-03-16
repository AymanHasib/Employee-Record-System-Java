package employeegui;
public class ComissionEmployee extends Employee {
    double commission ,sale;
    public ComissionEmployee(String name, String id, String designation, double commission, double sale) {
        super(name, id, designation);
	this.commission = commission;
	this.sale = sale;
	}
        
            double getSalary(double _sale)
	{
	return commission * _sale ;
	}
	@Override
	void increaseSalary(double amt)
	{
	try{
            if(commission+amt > 30){
	//throw new InvalidSalaryException("Commission cannot be more than 30%");
                    }
	else{
                commission += amt;
            }
            }
            catch(Exception e){
            System.out.println(e);
        }
	}
        
	@Override
	double getSalary()
	{
		return commission * sale;
	}
	
	@Override
        String display(){
        String s="Name: "+getName()+"   Id: "+getId()+"   Designation: "+getDesignation()+"   Salary: "+this.getSalary()+"\n";
        return s;
    }
	
}
