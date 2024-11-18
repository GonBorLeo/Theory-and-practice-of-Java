package com.intellekta;

import java.io.*;
import java.util.*;

public class StreamWorkComparison {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(compareReading("Notes.txt")));
    }

    public static long checkFileInputStream(String path) {
        long timeBefore = System.currentTimeMillis();

        File file = new File(path);
        try (FileInputStream fis = new FileInputStream(file)) {
            while (fis.read() != -1) {
                System.out.println(fis.read());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        long timeAfter = System.currentTimeMillis();

        return timeAfter - timeBefore;
    }

    public static long checkFileReaderWork(String path) {
        long timeBefore = System.currentTimeMillis();

        File file = new File(path);
        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.read() != -1) {
                System.out.println(fileReader.read());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        long timeAfter = System.currentTimeMillis();

        return timeAfter - timeBefore;
    }

    public static long checkBufferedReaderWork(String path) {
        long timeBefore = System.currentTimeMillis();

        File file = new File(path);
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        long timeAfter = System.currentTimeMillis();
        return timeAfter - timeBefore;
    }

    public static long checkScannerWork(String path) {
        long timeBefore = System.currentTimeMillis();

        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        long timeAfter = System.currentTimeMillis();
        return timeAfter - timeBefore;
    }

    public static String[] compareReading(String path) {
        try {
            long zNumber = checkFileInputStream(path);
            String zString = "FileInputStream";
            System.out.println();

            long aNumber = checkFileReaderWork(path);
            String aString = "FileReader";
            System.out.println();

            long bNumber = checkBufferedReaderWork(path);
            String bString = "BufferedReader";
            System.out.println();

            long cNumber = checkScannerWork(path);
            String cString = "Scanner";
            System.out.println();

            Map<Long, String> map = new TreeMap<>();
            map.put(zNumber, zString);
            map.put(aNumber, aString);
            map.put(bNumber, bString);
            map.put(cNumber, cString);

            String[] result = new String[map.size()];
            int count = 0;
            for (Map.Entry<Long, String> entry : map.entrySet()) {
                result[count++] = (entry.getValue() + "," + entry.getKey());
            }
            return result;
        } catch (Exception e) {
            System.out.println("Error");
            return new String[0];
        }
    }
}
