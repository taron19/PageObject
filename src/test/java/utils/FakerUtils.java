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
    private String subject = faker.options().option("Chemistry", "Maths", "Biology");
    private String hobby = faker.options().option("Sports", "Reading", "Music");
    private String state = getRandomState();
    private String city = generateCity(state);


    private String generateCity(String state) {
        return switch (state) {

            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }

    public  String getRandomState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
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
