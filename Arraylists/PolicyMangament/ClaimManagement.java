package Arraylists.PolicyMangament;

import java.util.ArrayList;
import java.util.Scanner;

class Claim{
    int claim_number;
    int policy_number;
    String claimant_name;
    Long claim_amount;
    String claim_status;
    Claim(int claim_number,int policy_number,  String claimant_name, Long claim_amount, String claim_status){
        this.claim_number=claim_number;
        this.policy_number=policy_number;
        this.claimant_name=claimant_name;
        this.claim_amount=claim_amount;
        this.claim_status=claim_status;
    }

    public int getClaim_number() {
        return claim_number;
    }

    public void setClaim_number(int claim_number) {
        this.claim_number = claim_number;
    }

    public int getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(int policy_number) {
        this.policy_number = policy_number;
    }

    public String getClaimant_name() {
        return claimant_name;
    }

    public void setClaimant_name(String claimant_name) {
        this.claimant_name = claimant_name;
    }

    public Long getClaim_amount() {
        return claim_amount;
    }

    public void setClaim_amount(Long claim_amount) {
        this.claim_amount = claim_amount;
    }

    public String getClaim_status() {
        return claim_status;
    }

    public void setClaim_status(String claim_status) {
        this.claim_status = claim_status;
    }
    @Override
    public String toString() {
        return "Claim Number : "+claim_number+"\n"+"Policy Number : "+policy_number+"\n"+"Claimant's Name : "+claimant_name+"\n"+"Claim Amount : "+claim_amount+"\n"+"Claim Status : "+claim_status+"\n";
    }
}
public class ClaimManagement {
    static ArrayList<Claim> claims=new ArrayList<>();
    static int claim_number;
    static int policy_number;
    static String claimant_name;
    static Long claim_amount;
    static String claim_status;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Enter the choice");
            System.out.println("1.Add new claim");
            System.out.println("2.Update claim status");
            System.out.println("3.Claim status report");
            System.out.println("4.Exit");
            Scanner scannerobject = new Scanner(System.in);
            choice = scannerobject.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the details of new claim");
                    System.out.println("Name of claimant");
                    scannerobject.nextLine();
                    claimant_name=scannerobject.nextLine();
                    System.out.println("Policy number");
                    policy_number=scannerobject.nextInt();
                    System.out.println("Claim number");
                    claim_number=scannerobject.nextInt();
                    System.out.println("Claim Amount");
                    claim_amount=scannerobject.nextLong();
                    claim_status="pending";
                    Claim claimobject=new Claim(claim_number,policy_number,claimant_name,claim_amount,claim_status);
                    claims.add(claimobject);
                    System.out.println(claims);
                    break;
                case 2:
                    System.out.println("Update Claim Status");
                    System.out.println("Enter the claim number of which status should be updated");
                    int updating_claim=scannerobject.nextInt();
                    Claim obejctclaim_update=null;
                    for(int i=0;i<claims.size();i++){
                        if(updating_claim==claims.get(i).claim_number){
                            obejctclaim_update=claims.get(i);
                        }
                    }
                    int status;
                    do{
                        System.out.println("Enter the status");
                        System.out.println("1.Pending");
                        System.out.println("2.Approved");
                        System.out.println("3.Rejected");
                        System.out.println("4.Exit");
                        status=scannerobject.nextInt();
                        switch (status){
                            case 1:
                                obejctclaim_update.claim_status="pending";
                                break;
                            case 2:
                                obejctclaim_update.claim_status="approved";
                                break;
                            case 3:
                                obejctclaim_update.claim_status="rejected";
                                break;
                            case 4:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                    }while (status<4);
                    break;
                case 3:
                    System.out.println("Enter the claim number to find status");
                    int find_status=scannerobject.nextInt();
                    for(int i=0;i<claims.size();i++){
                        if(find_status==claims.get(i).claim_number){
                            System.out.println(claims.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }while (choice<4);
    }
}
//Problem Statement: Develop a claim tracking system using ArrayList to store
//insurance claims. Each claim should include details such as claim number, policy
//number, claimant's name, claim amount, and status (e.g., pending, approved, rejected).
//Implement functionality to add new claims, update claim status, and generate reports on
//the status of claims.