package dev.aang.TP.TP11;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) throws Exception {
        ArrayList<Email> mails = new ArrayList<>();
        mails.add(new Email(1, "Eren Yeager", "Titan 1", "hellow, how are you?", LocalDate.of(2021, 5, 1), false));
        mails.add(new Email(2, "Armin Arlert", "Titan 2", "let's meet tomorrow", LocalDate.of(2021, 4, 29), false));
        mails.add(new Email(3, "Mikasa Ackerman", "Titan 3", "project deadline", LocalDate.of(2021, 4, 30), true));

        try {
            FileOutputStream outputStream = new FileOutputStream("email.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mails);
            objectOutputStream.close();
            System.out.println("Writing to email.txt . . .");

            FileInputStream inputStream = new FileInputStream("email.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Email> readEmails = (ArrayList<Email>) objectInputStream.readObject();
            System.out.println("Reading from email.txt . . .");
            readEmails.forEach(Email::display);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
