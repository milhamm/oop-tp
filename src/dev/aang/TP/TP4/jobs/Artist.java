package dev.aang.TP.TP4.jobs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Artist {

    private String name;
    private Date birthdate;
    private int age;

    public Artist(String name, String birthdate) {
        try {
            setName(name);
            setBirthdate(new SimpleDateFormat("yyyy-MM-dd").parse(birthdate));
            LocalDate _birthdate = this.birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            setAge(Period.between(_birthdate, LocalDate.now()).getYears());
        } catch (ParseException e) {
            System.out.println("Error Parse");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return new SimpleDateFormat("dd MMMM yyyy").format(birthdate);
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("Artist Name: %s\nBirthdate: %s\nAge: %d\n\n", getName(), getBirthdate(), getAge());
    }
}
