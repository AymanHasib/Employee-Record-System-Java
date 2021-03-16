    package employeegui;
    abstract class Employee {
    private String name,id,designation;
    			//constructor -b
    public Employee(String name, String id, String designation){ 
	
        super();
        this.name = name;
        this.id = id;
        this.designation = designation;	
	}
		//task-c
    abstract double getSalary() ;	
			///task-d..
    abstract void increaseSalary(double amt);

    String getId()
    {
	return id;
    }
			
    abstract String display();
				//getter-setter method..
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDesignation() {
	return designation;
    }

    public void setDesignation(String designation) {
	this.designation = designation;
    }

    public void setId(String id) {
	this.id = id;
    }
    
    public void getId(String id) {
	this.id = id;
    }
}
