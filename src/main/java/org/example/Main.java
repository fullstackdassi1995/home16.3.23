package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //2:

        MobilePhone phone1 = new MobilePhone("058-5464541", "iPhone", "iOs 16.x", 6.7f);
        MobilePhone phone2 = new MobilePhone("053-5454121", "Galaxy", "samsung", 6.7f);
        MobilePhone phone3 = new MobilePhone("058-5451212", "Galaxy", "samsung", 8.8f);
        MobilePhone phone4 = new MobilePhone("058-5464541", "iPhone", "iOs 16.x", 6.7f);
        MobilePhone phone5 = new MobilePhone("052-5754541", "Smartphone", "samsung", 5f);

        System.out.println(phone1.hashCode() + "\n" + phone4.hashCode());
        System.out.println(phone1.equals(phone4));


        //3:



        Scanner scanner = new Scanner(System.in);
        String num_phone = scanner.next();

        if (MobilePhone.mup_models_to_phone.containsKey(num_phone)) {
            System.out.println(MobilePhone.mup_models_to_phone.get(num_phone));
        } else System.out.println("not exist");



        //4:


        Scanner scanner2 = new Scanner(System.in);
        String model = scanner2.next();

        if (MobilePhone.mup_models_to_phone.containsKey(model)) {
            System.out.println(MobilePhone.mup_models_to_phone.get(model));
        } else System.out.println("not exist");



        //5:


        ArrayList<MobilePhone> size_phone = new ArrayList<>();

        fonc(phone1, size_phone);
        fonc(phone2, size_phone);
        fonc(phone3, size_phone);
        fonc(phone4, size_phone);
        fonc(phone5, size_phone);
        Scanner scanner3 = new Scanner(System.in);
        Float size = scanner3.nextFloat();

        if (myhashmap3.containsKey(size)) {
            System.out.println(myhashmap3.get(size));
        } else System.out.println("not exist");

    }

    static HashMap <Float, ArrayList<MobilePhone>> myhashmap3 = new HashMap<>();
    public static void fonc(MobilePhone phone1,ArrayList<MobilePhone> size_phone){
        size_phone.add(phone1);
        if(!myhashmap3.containsKey(phone1.size)){
            size_phone = new ArrayList<>();
            myhashmap3.put(phone1.size, size_phone);
        }
        else {size_phone = myhashmap3.get(phone1.size);}
        size_phone.add(phone1);
    }
}