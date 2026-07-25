package com.rehman.file_handling;

import java.io.*;

public class BufferedWriter_BufferedReader {

    public static void main(String[] args) throws IOException {

//        1
//        Create a file using File Class by passing pathname & fileName.ext at the end

        File myFile2 = new File("C:\\Java\\core_java\\src\\com\\rehman\\file_handling\\file_store\\myFile2.md");

//        2
//        Create new file

        myFile2.createNewFile();
        System.out.println("File Created Successfully");

//        A Bufferpool present which have two objects BufferReader & BufferWriter
//        Here Java only interact with this Bufferpool , instead of directly interacting with the memory
//        This prevent direct-accessing-memory , direct-hitting-on-memory

//        3 ---> BufferWriter

//        Create-FileWriter
        FileWriter fwrite = new FileWriter(myFile2);

//        Create-BufferedWriter-&-Pass-FileWriter_Object
        BufferedWriter bw = new BufferedWriter(fwrite);

        bw.write("#### This is BufferedWriter Class With FileWriter Too ! " + "\n#### This is Second Line ! " + "\n#### This is Third Line !");

//        Also closing is must important , to tell java I have done writing now, you can render / write in file
        bw.close();


//        4 --> BufferedReader

//        Create a file-reader object
        FileReader fread = new FileReader(myFile2);

//        Create a BufferedReader Object and pass the FileReader Object in constructor
        BufferedReader br = new BufferedReader(fread);

//        Read File using readLine() method

//        Gives first line only
//        System.out.println(br.readLine());

//        Gives All line in Array Format
        System.out.println(br.readAllLines());

    }
}
