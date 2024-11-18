package com.intellekta;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportNotesFromFileToList {

    public static List<String> readNotesToList(String path) {
        File file = new File(path);
        if (!file.canRead()) {
            System.out.println("Access denied.");
            return List.of();
        }
        try (Scanner scanner = new Scanner(file)) {
            List<String> notesList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    notesList.add(line);
                }
            }
            return notesList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return List.of();
        } finally {
            System.out.println("Process finished");
        }
    }

    public static void writeCommentToNotes(String path) {
        File file = new File(path);
        if (!file.canWrite()) {
            System.out.println("Access denied.");
            return;
        }
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter your comment: ");
            String comment = inputScanner.nextLine();
            pw.println("# " + comment);
        } catch (IOException e) {
            System.out.println("File mot found");
        } finally {
            System.out.println("Process finished");
        }
    }
}
