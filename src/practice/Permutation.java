package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Java program to print all permutations of a 
//given string. 
public class Permutation 
{ 
	
	private static List<String> list = null;
 public static void main(String[] args) 
 { 
	 list = new ArrayList<>();
     String str = "ABC"; 
     int n = str.length(); 
     Permutation permutation = new Permutation(); 
     permutation.permute(str, 0, n-1); 
     System.out.println(list);
     
     
     
     String s = "AAC";
     String s1 = "ABC";
     String s2 = "ABCD";
     System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
     System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
     System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
 } 

 /** 
  * permutation function 
  * @param str string to calculate permutation for 
  * @param l starting index 
  * @param r end index 
  */
 private void permute(String str, int l, int r) 
 { 
	 
     if (l == r) {
         System.out.println(str); 
         list.add(str);
     }
     else
     { 
         for (int i = l; i <= r; i++) 
         { 
             str = swap(str,l,i); 
             permute(str, l+1, r); 
             str = swap(str,l,i); 
         } 
     } 
 } 

 /** 
  * Swap Characters at position 
  * @param a string value 
  * @param i position 1 
  * @param j position 2 
  * @return swapped string 
  */
 public String swap(String a, int i, int j) 
 { 
     char temp; 
     char[] charArray = a.toCharArray(); 
     temp = charArray[i] ; 
     charArray[i] = charArray[j]; 
     charArray[j] = temp; 
     return String.valueOf(charArray); 
 } 
 
 
 public static Set<String> permutationFinder(String str) {
     Set<String> perm = new HashSet<String>();
     //Handling error scenarios
     if (str == null) {
         return null;
     } else if (str.length() == 0) {
         perm.add("");
         return perm;
     }
     char initial = str.charAt(0); // first character
     String rem = str.substring(1); // Full string without first character
     Set<String> words = permutationFinder(rem);
     for (String strNew : words) {
         for (int i = 0;i<=strNew.length();i++){
             perm.add(charInsert(strNew, initial, i));
         }
     }
     return perm;
 }
 
 public static String charInsert(String str, char c, int j) {
     String begin = str.substring(0, j);
     String end = str.substring(j);
     return begin + c + end;
 }



} 














/*




class Result {

    
     * Complete the 'rearrangeWord' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     
 private static List<String> list = null;
    public static String rearrangeWord(String word) {
    // Write your code here
        list = new ArrayList<>();
        Set<String> hs = new HashSet<>();
        int n = word.length();  
        permute(word, 0, n-1);
        //System.out.println(list); 
        
        if(list.size() == 2){
            
            hs.addAll(list);
            if(hs.size() == 1)
               return "no answer";   
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            if(element.equalsIgnoreCase(word)){
                return itr.next();
            }
        }
        
        return "";
    }
    
    public static List<String> permute(String str, int l, int r) 
    { 
     if (l == r) 
         list.add(str);
     else
     { 
         for (int i = l; i <= r; i++) 
         { 
             str = swap(str,l,i); 
             permute(str, l+1, r); 
             str = swap(str,l,i); 
         } 
     }
        return list;
 } 
    
    public static String swap(String a, int i, int j) 
 { 
     char temp; 
     char[] charArray = a.toCharArray(); 
     temp = charArray[i] ; 
     charArray[i] = charArray[j]; 
     charArray[j] = temp; 
     return String.valueOf(charArray); 
 }

}*/
