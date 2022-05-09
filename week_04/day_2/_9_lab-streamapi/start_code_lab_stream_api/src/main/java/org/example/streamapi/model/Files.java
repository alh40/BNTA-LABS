package org.example.streamapi.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Files {


    File file = new File("");

    Scanner input = new Scanner(System.in);

    String fileContent = "";

    while(input.hasNextLine()){
        fileContent = fileContent.concat(input.nextLine() + "\n");
    }

    FileWriter writer = new FileWriter("");

    writer.write(fileContent);
    writer.flush();
    writer.close();

}
