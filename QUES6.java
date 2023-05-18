//Write a program that copies content of one file to another. Pass the names of the files through command-line arguments.

import java.io.*;

class Q6 {
    
    public static void main(String args[])
    {
        try(FileInputStream fin = new FileInputStream(args[0]);FileOutputStream fout = new FileOutputStream(args[1]))
        {
            int i;
            do
            {
                i = fin.read();
                fout.write((char)i);
                
            }while (i != -1);
    }
        catch(IOException e)
        {
            System.out.println("Exception caught: "+ e);
        }
    
    }
}
