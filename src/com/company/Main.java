package com.company;

import BSearch.BinarySearch;
import CRC32.CRC32;
import Time.Time;
import Users.User2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import Users.User;
import static File.FileRead.Read;


public class Main {

    public static void main(String[] args) throws JsonProcessingException {
            System.out.println("\n------Binary Search------");
            BinarySearch bs = new BinarySearch();
            int[] array = { 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
            int index = bs.searchIndex(array, 11);
            System.out.println(index);

            System.out.println("\n------CRC32------");
            CRC32 run = new CRC32();
            System.out.println(run.crc32("This is example text ..."));

            System.out.println("\n------Time------");
            Time time = new Time();
            time.LocalTime();
            time.GlobalTime();

            System.out.println("\n------Line------");
            String text = "Line 1\nLine 2\nLine 3";
            String[] line = text.split("\n");
            for (String part : line) {
                    System.out.println(part);
            }

            System.out.println("\n------Java to Json------");
            ObjectMapper objectMapper = new ObjectMapper();

            User userObject = new User("John", 21);
            String userJson = objectMapper.writeValueAsString(userObject);

            System.out.println(userJson);

            //Nie działa -.-
            /*System.out.println("\n------Json to Java------");
            String userJson2 = "{\"name\":\"John\",\"age\":21}";
            User2 userObject2 = objectMapper.readValue(userJson2, User2.class);

            System.out.println(userObject2.getName()); // John
            System.out.println(userObject2.getAge());  // 21*/


            System.out.println("\n-----Read File miau-------");
            Read();

            System.out.println("\n-----Write to File-------");
            FileOutputStream connect = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Get File Name:");
            String fileName = input.nextLine();
            System.out.println("Get Text:");
            String txt = input.nextLine();
            String fileVariant = ".txt";
            try
            {
                    connect = new FileOutputStream(fileName+fileVariant);
                    for(int i = 0; i < txt.length(); i++)
                    {
                            connect.write(txt.charAt(i));
                    }
            }
            catch(IOException ex)
            {
                    System.out.println("FATAL ERROR");
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
