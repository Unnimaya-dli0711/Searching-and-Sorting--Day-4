package Arraylists.PolicyMangament;

import java.util.ArrayList;
import java.util.Scanner;

import static Arraylists.PolicyMangament.ClaimManagement.claim_number;

class PolicyPremium{
    String policy_type;
    double base_premium;
    double risk_factor;
    double calculatepremium;
    PolicyPremium(String policy_type ,double base_premium , double risk_factor){
        this.policy_type=policy_type;
        this.base_premium=base_premium;
        this.risk_factor=risk_factor;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public double getBase_premium() {
        return base_premium;
    }

    public void setBase_premium(double base_premium) {
        this.base_premium = base_premium;
    }

    public double getRisk_factor() {
        return risk_factor;
    }

    public void setRisk_factor(double risk_factor) {
        this.risk_factor = risk_factor;
    }

    public double getCalculatePremium() {
        return calculatepremium;
    }

    public void setCalculatePremium() {
        this.calculatepremium = calculatePremium(risk_factor);
    }

    double calculatePremium(double risk_factor){
        return  base_premium*(1+risk_factor);
    }
    @Override
    public String toString() {
        return "Policy type : "+policy_type+"\n"+"base premium : "+base_premium+"\n"+"Risk Factor : "+risk_factor+"\n"+" Premium : "+calculatepremium+"\n";
    }
}
public class PremiumCalculation {
    static String policy_type;
    static double base_premium;
    static double risk_factor;
    static ArrayList<PolicyPremium> premiums=new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Enter the choice");
            System.out.println("1.Calculate Premium");
            System.out.println("2.Update Premium");
            System.out.println("3.report");
            System.out.println("4.Exit");
            Scanner scannerobject = new Scanner(System.in);
            choice = scannerobject.nextInt();
            PolicyPremium premiumobject = null;
            switch (choice) {
                case 1:
                    System.out.println("Enter the details");
                    System.out.println("Enter Policy Type");
                    scannerobject.nextLine();
                    policy_type = scannerobject.nextLine();
                    System.out.println("Base Premium");
                    base_premium = scannerobject.nextDouble();
                    System.out.println("Risk Factor");
                    risk_factor = scannerobject.nextDouble();

                    premiumobject = new PolicyPremium(policy_type, base_premium, risk_factor);
                    premiumobject.setCalculatePremium();
//                    premiums.add(premiumobject);
//                    System.out.println(premiums);
                    System.out.println(premiumobject);
                    break;
                case 2:
                    System.out.println("update premium");
                    System.out.println("Enter the new risk factor");
                    double newrisk = scannerobject.nextDouble();
                    premiumobject = new PolicyPremium(policy_type, base_premium, newrisk);
                    premiumobject.calculatePremium(newrisk);
                    System.out.println(premiumobject);
                    break;
                case 3:
                    System.out.println("Report");
                    System.out.println(premiumobject);
                    break;
                case 4:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("Invalid");

            }
        } while (choice < 4);
    }
}
//Each insurance policy should have attributes such as policy type, base
//premium, and risk factors. Implement functionality to calculate and update premiums
//based on different risk factors and policy types, and provide a report of all calculated
//premiums