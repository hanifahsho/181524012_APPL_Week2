/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copying.a.file;

/**
 *
 * @author Hani
 */


import java.util.Scanner;
import java.io.*;

public class CopyFile
{
    public static void main(String[] args)
    {
        String filename;
        Scanner fileScanner; 
        Scanner scan = new Scanner(System.in);

    while(true){
        try{
            System.out.print("Enter a filename: ");
            filename = scan.next();
            fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
            break;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist, please try again.");
        }
    }

    }

}