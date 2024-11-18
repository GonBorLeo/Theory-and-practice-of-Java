package com.intellekta.JUnut;

import java.io.*;
import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.intellekta.JUnut.ImportUsers.importUsersToList;


public class ImportUsers {
    public static void main(String[] args) throws IOException {
        String path = "users.txt";
        importUsersToList(path);
    }

    public static void importUsersToList(String path) throws IOException {
        LinkedList<String> users = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            if (currentLine != "")
                users.add(currentLine);
        }
    }
}

class ImportUsersTest {
    @Test
    public void importUsersToList_WithoutThrows() {
        String path = "users.txt";
        Assertions.assertDoesNotThrow(() -> importUsersToList(path));
    }

    @Test
    public void importUsersToList_WithoutEmptyString() {
        String path = "";
        boolean withoutEmptyString = true;
        try {
            importUsersToList(path);
        } catch (IOException e) {
            withoutEmptyString = false;
        }
        Assertions.assertFalse(withoutEmptyString);
    }

    @Test
    public void importUsersToList_WithoutNull() {
        boolean withoutNull = false;
        try {
            importUsersToList(null);
        } catch (NullPointerException | IOException e) {
            withoutNull = true;
        }
        Assertions.assertTrue(withoutNull);
    }

    @Test
    public void importUsersToList_FileIsNotEmpty() throws IOException {
        String path = "users.txt";
        boolean fileIsNotEmpty = true;
        BufferedReader br;
        br = new BufferedReader(new FileReader(path));
        if (br.readLine() == null) {
            fileIsNotEmpty = false;
        }
        Assertions.assertTrue(fileIsNotEmpty);
    }

    @Test
    public void importUsersToList_FileExistence() {
        String path = "users.txt";
        File file = new File(path);
        Assertions.assertTrue(file.exists());
    }
}
