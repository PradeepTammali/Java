import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.HashMap;

import java.util.Map;


/**
 * Created by sarthak on 22/10/18
 */


public class chefTest {
    public static void main(String[] args) throws IOException {
        
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
      int T = Integer.parseInt(reader.readLine());
   
     while (T-- > 0) {
         
   int N = Integer.parseInt(reader.readLine());
  
          Map<String, Integer> occuredBefore = new HashMap<>();
     
       int ans = 0;
   
         while (N-- > 0) {
            
    int val = 0;
           
     int prev = 0;
          
      String str = reader.readLine();
      
          if (occuredBefore.get(str) != null) {
           
         ans += (occuredBefore.get(str) / 2);
     
               continue;
             
   }
              
  for (int i = 0; i < str.length(); i++) {
      
              char ch = str.charAt(i);
              
      if (ch == 'd' || ch == 'f') {
              
          val += (prev == 2 || i == 0) ? 2 : 4;
  
                      prev = 1;
     
               }
                  
  if (ch == 'j' || ch == 'k') {
                    
    val += (prev == 1 || i == 0) ? 2 : 4;
                
        prev = 2;
                   
 }
             
   }
   
             ans += val;
        
        occuredBefore.put(str, val);
 
           }
           
 System.out.println(ans);

     
   }
  
  }

}