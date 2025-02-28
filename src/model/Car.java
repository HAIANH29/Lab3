/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import tools.Acceptable;
import tools.Inputter;

/**
 *
 * @author LENOVO
 */
public class Car implements Acceptable{
    
    HashMap<String, String> fidnDistrict = new HashMap<String, String>();

    private String licensePlate;
    private String carOwner;
    private String phoneNumber;
    private String carBrand;
    private int valueOfVehicle;
    private String registrationDate;
    private String placeOfRegistration;
    private int numberOfSeats;

    public Car() {
    }

    public Car(String licensePlate, String carOwner, String phoneNumber, String carBrand, int valueOfVehicle, String registrationDate, String placeOfRegistration, int numberOfSeats) {
        this.licensePlate = licensePlate;
        this.carOwner = carOwner;
        this.phoneNumber = phoneNumber;
        this.carBrand = carBrand;
        this.valueOfVehicle = valueOfVehicle;
        this.registrationDate = registrationDate;
        this.placeOfRegistration = placeOfRegistration;
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getValueOfVehicle() {
        return valueOfVehicle;
    }

    public void setValueOfVehicle(int valueOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPlaceOfRegistration() {
        return placeOfRegistration;
    }

    public void setPlaceOfRegistration(String placeOfRegistration) {
        this.placeOfRegistration = placeOfRegistration;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean creatNewOwner() {
        boolean isValidInput;
        do {
            String newLicensePlate = Inputter.getString("Enter new license plate: ");
            isValidInput = isValid(newLicensePlate, REGEX_LICENSE_PLATE);

            if (isValidInput) {
                this.licensePlate = newLicensePlate;

            } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling in this information? [Yes or No]: ")) {
                return false;
            }

        } while (!isValidInput);

        do {
            String newOwnerName = Inputter.getString("Enter new owner name: ");
            isValidInput = isValid(newOwnerName, REGEX_OWNER_NAME);

            if (isValidInput) {
                this.carOwner = newOwnerName;
            } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling this information? [Yes or No]: ")) {
                return false;
            }

        } while (!isValidInput);

        do {
            String newPhoneNumber = Inputter.getString("Enter new phone number: ");
            isValidInput = isValid(newPhoneNumber, REGEX_PHONE_NUMBER);
            if (isValidInput) {
                this.phoneNumber = newPhoneNumber;
            } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling this information? [Yes or No]: ")) {
                return false;
            }
        } while (!isValidInput);

        do {
            String newCarBrand = Inputter.getString("Enter new car brand: ");
            isValidInput = isValid(newCarBrand, REGEX_CAR_BRAND);

            if (isValidInput) {
                this.carBrand = newCarBrand;
            } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling this information? [Yes or No]: ")) {
                return false;
            }
        } while (!isValidInput);

        do {
            try {
                int newVehicleValue = Inputter.getIntegerNumber("Enter number of seats: ");
                isValidInput = newVehicleValue > 999;
                if (isValidInput) {
                    this.valueOfVehicle = newVehicleValue;
                } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling this information? [Yes or No]: ")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Invalid data, please try again!!!");
            }
        } while (!isValidInput);

        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        do {
            String newRegistrationDate = Inputter.getString("Enter new registration date: ");
            isValidInput = isValid(newRegistrationDate, REGEX_REGISTRATION_DATE);
            if (isValidInput && compareDate(newRegistrationDate, today) < 0) {
                this.registrationDate = newRegistrationDate;
            } else if (!Inputter.confirmOption("Invalid input. Do you want to continue filling this information? [Yes or No]: ")) {
                return false;
            }

        } while (!isValidInput);

        return true;
    }

    public String checkThirdCharacter(String plate) {
        char thirdChar = plate.charAt(2);
        HashMap<Character, String> disrtictMap = new HashMap<>();
        disrtictMap.put('T', "District 1");
        disrtictMap.put('B', "District 2");

        disrtictMap.put('F', "District 3");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

        disrtictMap.put('T', "District 1");

    }

    public int compareDate(String date1, String date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);
            return d1.compareTo(d2);
        } catch (ParseException e) {
            System.out.println("Invalid date format 'dd-MM-yyyy', try again!!! ");
            return -2;
        }

    }

    @Override
    public String toString() {
        return "Car{" + "licensePlate=" + licensePlate + ", carOwner=" + carOwner + ", phoneNumber=" + phoneNumber + ", carBrand=" + carBrand + ", valueOfVehicle=" + valueOfVehicle + ", registrationDate=" + registrationDate + ", placeOfRegistration=" + placeOfRegistration + ", numberOfSeats=" + numberOfSeats + '}';
    }

    @Override
    public boolean isValid(String data, String regex) {
        return data.matches(regex);
    }

}
