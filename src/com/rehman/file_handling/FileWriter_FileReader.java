package com.rehman.file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_FileReader {

    public static void main(String[] args) throws IOException {

//        1
//        Create a file using File Class by passing pathname & fileName.ext at the end

        File myFile1 = new File("C:\\Java\\core_java\\src\\com\\rehman\\file_handling\\file_store\\myFile1.md");

//        2
//        Check the file exists or not

        System.out.println("Check the file exists or not - " + myFile1.exists());

//        3
//        Create new file

        myFile1.createNewFile();
        System.out.println("File Created Successfully");

//        4
//        To write something we need to create object of FileWriter
//        Then by passing the file in the constructor , we can have methods for the file to write there

        FileWriter fw = new FileWriter(myFile1);

        fw.write("#### This is FileWriter Class Only !");

//        Closing is very, very important because you need to tell java i stopped working for the file
//        Now you can render
        fw.close();


//        5
//        To read something we need to create object of FileReader
//        Then by passing the file in the constructor , we can have methods for the file to read

        FileReader fr = new FileReader(myFile1);

        System.out.println(fr.readAllLines());


    }
}
