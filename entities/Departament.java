package entities;

public class Departament {
    private String name;
    public Departament(){

    }
    public Departament(String name){
        this.name = name;
    }

    public String toString(){
        return "Departament: "+ name; 
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
