package org.example;


import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MobilePhone {
    public static HashMap<String, ArrayList<MobilePhone>> mup_models_to_phone = new HashMap<>();
    private static ArrayList instances = new ArrayList();

    public String phone_number;
    public String model;
    public String os_version;
    @Getter
    public Float size;

    public MobilePhone(String phone_number, String model, String os_version, Float size) {

        this.phone_number = phone_number;
        this.model = model;
        this.os_version = os_version;
        this.size = size;

        ArrayList<MobilePhone> list_of_this_model;
        ArrayList<MobilePhone> list_of_this_phone;


        if (!MobilePhone.mup_models_to_phone.containsKey(this.model)) {
            list_of_this_model = new ArrayList<>();
            MobilePhone.mup_models_to_phone.put( this.model, list_of_this_model);
        }
        else {
            list_of_this_model = MobilePhone.mup_models_to_phone.get(this.model);
        }
        list_of_this_model.add(this);



        if (!MobilePhone.mup_models_to_phone.containsKey(this.phone_number)) {
            list_of_this_phone = new ArrayList<>();
            MobilePhone.mup_models_to_phone.put( this.phone_number, list_of_this_phone);
        }
        else {
            list_of_this_phone = MobilePhone.mup_models_to_phone.get(this.phone_number);
        }
        list_of_this_phone.add(this);


    }


    @Override
    public String toString() {
        return "MobilePhone{" +
                "phone_number='" + phone_number + '\'' +
                ", model='" + model + '\'' +
                ", os_version='" + os_version + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone phone = (MobilePhone) o;
        return Objects.equals(phone_number, phone.phone_number) && Objects.equals(model, phone.model) && Objects.equals(os_version, phone.os_version) && Objects.equals(size, phone.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone_number, model, os_version, size);
    }

    public static ArrayList getInstances() {
        return instances;
    }


}