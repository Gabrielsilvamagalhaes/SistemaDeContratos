package entities;

import java.time.LocalDate;
import java.util.ArrayList;

import entities_enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private ArrayList<HourContract> x = new ArrayList<>();
    
    public Worker(){

    }
    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        x.add(contract);
    }
    public void removeContract(HourContract contract){
        x.remove(contract);
        
    }
    public Double income(Integer year, Integer month){
        Double valueGain=0.0;
        for(HourContract w : x){
            LocalDate tempoory =w.getDate();
            if(tempoory.getMonthValue()==month && tempoory.getYear()==year){
                valueGain += w.totalValue();
            }

        }   
        return valueGain+baseSalary;

    }
    
    public String toString(){
        return "Name: "+ name;
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


    /**
     * @return WorkerLevel return the level
     */
    public WorkerLevel getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }


    /**
     * @return Double return the baseSalary
     */
    public Double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }


    /**
     * @return ArrayList<HourContract> return the x
     */
    public ArrayList<HourContract> getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(ArrayList<HourContract> x) {
        this.x = x;
    }

}
