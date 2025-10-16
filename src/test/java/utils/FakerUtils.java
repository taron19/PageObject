package utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class FakerUtils {
    private Faker faker = new Faker(Locale.US);
    private Random random = new Random();
    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String gender = faker.options().option("Female", "Male", "Other");
    private String email = faker.internet().emailAddress();
    private String adress = faker.address().fullAddress();
    private String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    private String year =String.format("%s", faker.number().numberBetween(1920, 2024));
    private String month = faker.options().option("January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December");
    private String day =  String.format("%s", faker.number().numberBetween(10, 28));
    private String picture = "Снимок экрана 2025-02-21 130657.png";
    private String subject = generateSubject();
    private String hobby = faker.options().option("Sports", "Reading", "Music");
    private String state = faker.options().option("NCR", "Uttar Pradesh", "Rajasthan", "Haryana");
    private String city = generateCity();


    private String generateCity() {

        if (state.equals("NCR")) {
            return faker.options().option("Delhi", "Gurgagon", "Noida");
        } else if (state.equals("Uttar Pradesh")) {
            return faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (state.equals("Rajasthan")) {
            return faker.options().option("Jaipur", "Jaiselmer");
        }
        return faker.options().option("Karnal", "Panipat");
    }


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

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getGender() {
        return gender;
    }


    public String getYear() {
        return year;
    }


    private String generateSubject() {
        String[] genders = {"Chemistry", "Maths", "Biology"};
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
