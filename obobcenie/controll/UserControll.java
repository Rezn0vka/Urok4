package obobcenie.controll;

import obobcenie.model.User;

public interface UserControll<T extends User> {

    void create(String lastName, String firstName, String middleName);
}
