package Arraylists.PolicyMangament;

import java.util.ArrayList;
import java.util.Scanner;

class Coverage{
    public String getCoverage_type() {
        return coverage_type;
    }

    public void setCoverage_type(String coverage_type) {
        this.coverage_type = coverage_type;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getPremium() {
        return premium;
    }

    public void setPremium(long premium) {
        this.premium = premium;
    }

    String coverage_type;
    long amount;
    long premium;
    Coverage(String coverage_type,long amount,long premium){
        this.coverage_type=coverage_type;
        this.amount=amount;
        this.premium=premium;
    }
    @Override
    public String toString() {
        return "Coverage Type : "+coverage_type+"\n"+"Amount : "+premium+"\n"+"Coverage Amount : "+amount+"\n";
    }
}
public class CoverageComparison {
    public static void main(String[] args){
        ArrayList<Coverage> coverages=new ArrayList<>();
        String coverage_type;
        long amount;
        long premium;
        int choice;
        do {
            System.out.println("Enter the choice");
            System.out.println("1.Add Coverage Option");
            System.out.println("2.Compare Coverage");
            System.out.println("3.Exit");
            Scanner scannerobject = new Scanner(System.in);
            choice = scannerobject.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Coverage type");
                    coverage_type=scannerobject.next();
                    System.out.println("Enter the coverage amount");
                    amount=scannerobject.nextInt();
                    System.out.println("Enter premium");
                    premium=scannerobject.nextInt();
                    Coverage coverage=new Coverage(coverage_type,amount,premium);
                    coverages.add(coverage);
                    System.out.println(coverage);
                    break;
                case 2:
                    System.out.println("Comparing the coverage options");
                    System.out.println("on which basis you should compare");
                    int option;
                    do{
                        System.out.println("1.Coverage amount");
                        System.out.println("2.Premium Amount");
                        option=scannerobject.nextInt();
                        switch (option){
                            case 1:
                                long maximum=0;
                                int index=0;
                                for(int i=0;i<coverages.size();i++){

                                    if(coverages.get(i).amount>maximum)
                                    {
                                        index=i;
                                        maximum=coverages.get(i).amount;
                                    }
                                }
                                System.out.println("Maximum coverage is "+coverages.get(index));
                                break;
                            case 2:
                                long minimum=Long.MAX_VALUE;
                                int index_minimum=0;
                                for(int i=0;i<coverages.size();i++){

                                    if(coverages.get(i).premium<minimum)
                                    {
                                        index_minimum=i;
                                        minimum=coverages.get(i).premium;
                                    }
                                }
                                System.out.println("Minimum premium amount is "+coverages.get(index_minimum));
                                break;
                            case 3:
                                System.out.println("Exiting");
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                    }while (option>3);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid");

            }

        }while (choice<3);
    }
}
//Each coverage option should include details such as coverage type,
//amount, and premium. Implement functionality to add different coverage options,
//compare them based on coverage amount and premium, and recommend the best
//option based on specific criteria