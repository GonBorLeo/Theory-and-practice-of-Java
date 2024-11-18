package com.intellekta.client;

import java.io.*;
import java.util.Scanner;

public class OutputClients {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Борис\\Desktop\\Clients"; // Адрес папки, где будут лежать файлы
        File fileTxt = new File("Clients.txt"); // Файл с клиентами в строчном виде лежит в корневой папке проекта

        Scanner scanner = new Scanner(fileTxt);
        int numberFile = 0; // счетчик для названия файла

        while (scanner.hasNextLine()) { // Пока в Clientx.txt есть строки
            File newFile = new File(path + "\\client" + numberFile++ + ".out"); // Задаем название файла
            String line = scanner.nextLine();
            Client client = new Client(line);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile))) {
                newFile.createNewFile(); // Создаем файл
                oos.writeObject(client); // добавляем в него клиента
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
