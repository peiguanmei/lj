package com.p.paperProgramme;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeTwoFile {
    public static void main(String[] args) {
        try {
            FileReader fReaderA = new FileReader("c/:A.txt");
            FileReader fReaderB = new FileReader("c/:B.txt");
            FileWriter fWriterC = new FileWriter("c/:C.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
