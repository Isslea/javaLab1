package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

    public static void Read()
    {
        FileInputStream connect = null;

        try
        {
            connect = new FileInputStream("miau.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FATAL ERROR!");
            System.exit(1);
        }

        int letter = 0;
        try
        {
            letter = connect.read();
            while(letter != -1)
            {
                System.out.print((char)letter);
                letter = connect.read();
            }
        }
        catch (IOException e)
        {
            System.out.println("FATAL ERROR!");
            System.exit(2);
        }

        try
        {
            connect.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
