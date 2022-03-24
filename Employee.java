
package devplace;


public class Employee extends Person{
    
    //Aprovecho y heredo los parametros de la clase persona
    //para ahorrar codigo y reutilizar lo ya creado
    private int File;
    private String Department;

    public Employee(int File, String Department, String fName, String lName, String bday) {
        super(fName, lName, bday);
        this.File = File;
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public int getFile() {
        return File;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setFile(int File) {
        this.File = File;
    }
    
}
