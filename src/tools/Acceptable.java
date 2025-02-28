/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tools;

/**
 *
 * @author LENOVO
 */
public interface Acceptable {

    public final String REGEX_OWNER_NAME = "^.{2,25}$";
    public final String REGEX_PHONE_NUMBER = "^(03[2-9]|05[2689]|07[06789]|08[1-9]|09[0-9])\\d{7}$";
    public final String REGEX_LICENSE_PLATE = "^(5[0-9])([XTFCHKLUMGDENPSVYZ][1-9])(\\d{5})$";
    public final String REGEX_CAR_BRAND = "^[a-zA-Z]{5,12}$";
    public final String REGEX_REGISTRATION_DATE ="^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$";
    public boolean isValid(String data, String regex);

}
