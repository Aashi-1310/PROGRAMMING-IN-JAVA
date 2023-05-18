//Write a program to read a file and display only those lines that have the first two characters as '//' (Use try with resources). 

import java.io.*;

class Q7 {
    
    public static void main(String args[])
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/Sony/Desktop//A.txt")))
        {
            String s;
            while((s = br.readLine()) != null) {
                char ch = s.charAt(0);
                char ch1 = s.charAt(1);
            if((ch == '/') && (ch1 == '/'))
            {
                System.out.println(s);
            }
        }
    }
        catch(IOException e)
        {
            System.out.println("Exception caught: "+ e);
        }
    
    }
}

