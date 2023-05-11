package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer Hour;
    
    public HourContract(){

    }
    public HourContract(LocalDate date, Double valuePerHour, Integer Hour){
        this.date=date;
        this.valuePerHour = valuePerHour;
        this.Hour = Hour;
    }
    public Double totalValue(){
        return Hour * valuePerHour;
    }
    

    /**
     * @return Date return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return Double return the valuePerHour
     */
    public Double getValuePerHour() {
        return valuePerHour;
    }

    /**
     * @param valuePerHour the valuePerHour to set
     */
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    /**
     * @return Integer return the Hour
     */
    public Integer getHour() {
        return Hour;
    }

    /**
     * @param Hour the Hour to set
     */
    public void setHour(Integer Hour) {
        this.Hour = Hour;
    }

}
