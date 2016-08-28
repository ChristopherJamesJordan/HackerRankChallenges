import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numItems = scan.nextInt();
        int itemNotSplit = scan.nextInt();
        int totalToSplit = 0;
        
        for (int i = 0; i < numItems; i++){
            if (i != itemNotSplit){
                totalToSplit += scan.nextInt();
            } else{
                scan.nextInt();
                continue;
            }
        }
        
        // For testing
        //System.out.println("Total without item " + totalToSplit);
        
        int splitBill = totalToSplit / 2;
        int actualBilled = scan.nextInt();
        if ( splitBill == actualBilled){
            System.out.println("Bon Appetit");
        } else{
            System.out.println(actualBilled - splitBill);
        }
    }
}