package Generic3;

public class employee {
     String name;
     int id;
     String department;
     int salary;
     public employee(String name,int id,String department,int salary)
     {
    	 this.name=name;
    	 this.id=id;
    	 this.department=department;
    	 this.salary=salary;
     }
     @override
     public int hashcode()
     {
    	 return id;
     }
     public boolean equals(Object obj) {
    	 employee employee=(employee) obj;
    	 return(id==employee.id);
    	   }
     public String tostring()
     {
    	 return id+","+name+","+department+","+salary;
     }
}
