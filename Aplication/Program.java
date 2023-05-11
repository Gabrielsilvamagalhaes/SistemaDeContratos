package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities_enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        ArrayList<HourContract> user2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Worker user1;
        
        System.out.print("Enter departament: ");
        String departament = sc.nextLine();
        Departament user = new Departament(departament);
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Level: ");
        String leveling = sc.nextLine();
        leveling = leveling.toUpperCase();
        WorkerLevel level = WorkerLevel.valueOf(leveling);
        
        System.out.print("Base salary: ");
        Double basesalary = sc.nextDouble();
        user1 = new Worker(name, level, basesalary);
        
        int Quant =0;
        do{
            
            System.out.print("How many contracts to this worker? ");
            Quant = sc.nextInt();
        }while(Quant<=0);
        
        for(int i =0; i<Quant; i++){
            System.out.println("Enter contract #"+(i+1)+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            Integer valueperhour = sc.nextInt();

            System.out.print("Duration (hours): ");
            Double duration = sc.nextDouble();
            
            user2.add(new HourContract(date, duration, valueperhour));

        }
        //Formula para pegar apenas o mes e o ano e transforma-lo em data
        System.out.print("Enter month and year to calculate to income (MM/YYYY): ");
        String input = sc.next();
        String[] parts = input.split("/");
        String formattedDate = parts[1] + "-" + parts[0] + "-01";
        LocalDate date = LocalDate.parse(formattedDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        for(HourContract worker : user2){
            user1.addContract(worker);
        }
        System.out.println(user1);
        System.out.println(user);
        System.out.println("Income for "+ input +": " +user1.income(date.getYear(), date.getMonthValue()));
        sc.close();
    }

}
