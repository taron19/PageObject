package utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class FakerUtils {
    private Faker faker = new Faker(Locale.US);
    private Random random = new Random();
    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String gender = generateGender();
    private String email = faker.internet().emailAddress();
    private String adress = faker.address().fullAddress();
    private String phoneNumber = generatePhoneNumber();
    private String year = generateYear();
    private String month = generateMonth();
    private String day = generateDay();
    private String picture = "Снимок экрана 2025-02-21 130657.png";
    private String subject = generateSubject();
    private String hobby = generateHobbies();
    private String state = "Haryana";
    private String city = "Panipat";


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public String getPictureURL() {
        return picture;
    }

    private String generatePhoneNumber() {

        StringBuilder phoneNumber = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String generateGender() {
        String[] genders = {"Male", "Female", "Other"};
        return genders[random.nextInt(genders.length)];
    }

    public String getGender() {
        return gender;
    }

    private String generateYear() {
        int year = 1950 + random.nextInt(74);
        return String.valueOf(year);
    }

    public String getYear() {
        return year;
    }

    private String generateMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[random.nextInt(months.length)];
    }


    private String generateDay() {

        return String.valueOf(1 + random.nextInt(28));
    }

    private String generateSubject() {
        String[] genders = {"Chemistry", "Maths", "Biology"};
        return genders[random.nextInt(genders.length)];
    }

    private String generateHobbies() {
        String[] genders = {"Reading", "Sports", "Music"};
        return genders[random.nextInt(genders.length)];
    }

    public String selectState() {
        return state;
    }

    public String selectCity() {
        return city;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobby() {
        return hobby;
    }
}
