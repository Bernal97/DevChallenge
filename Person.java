package devplace;
public class Person {
    
    private String firstName;
    private String lastName;
    private String birthday;

    //COnstructores
    public Person() {
        firstName = "";
        lastName = "";
        birthday = "";
    }
    
    
    public Person (String fName, String lName, String bday){
        firstName = fName;
        lastName = lName;
        birthday = bday;
    }

    //El equals para comparar que no esten repetidos
    public boolean equals(Person p) {
        return firstName.equalsIgnoreCase(p.firstName) &&
                lastName.equalsIgnoreCase(p.lastName);
    }

    //Propios del tipo
    public String myInfo(Person p){
        return ("Nombre: " + p.firstName
                + "Apellido: " + p.lastName
                + "Cumpleaños: " + p.birthday);
    }
    
    //OBservadores
    public String getBirthday() {
        return birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //Modificadores
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return ("Nombre: " + firstName
                + "Apellido: " + lastName); 
    }
    
    
}
