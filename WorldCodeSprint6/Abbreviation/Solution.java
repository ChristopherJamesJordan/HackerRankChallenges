import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numQueries = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < numQueries; i++){
            String firstStr = scan.nextLine();
            String endStr = scan.nextLine();
            
            // For testing
            System.out.println(firstStr);
            System.out.println(endStr);
            
            // If the second string is longer than the first then not possible
            if (endStr.length() > firstStr.length()){
                System.out.println("NO");
                continue;
            }
            else{
                // Convert to char arrays and sort characters
                char[] firstArray = firstStr.toCharArray();
                char[] endArray = endStr.toCharArray();
                
                // Lengths of arrays for computation
                int numInitialChars = firstArray.length;
                int numFinalChars = endArray.length;
                
                // j and k are used to track the position in the first array
                int j = 0;
                int k = 0;
                
                // Keep a status tracker
                Boolean status = false;
                Boolean upBreak = false;
                
                // Iterate through the final array first
                for (; j < numFinalChars; j++){
                    status = false;
                    
                    if (upBreak){
                        break;
                    }
                    
                    // Iterate through the initial array second
                    for (; k < numInitialChars; k++){
                        if (firstArray[k] == endArray[j]){
                            k++;
                            status = true;
                            break;
                        } else if (Character.toUpperCase(firstArray[k]) == endArray[j]){
                            k++;
                            status = true;
                            break;
                        } else if (Character.toUpperCase(firstArray[k]) == firstArray[k]){
                            upBreak = true;
                            break;
                        } else{
                            continue;
                        }
                    }
                }
                
                // Check results, if loop did not reach final i, then not all chars there
                if (status && (j == numFinalChars)){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }      
        }
    }
}