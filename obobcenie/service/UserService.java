package obobcenie.service;

import java.util.List;
import obobcenie.model.User;

public interface UserService<T extends User> {

    public List<T> getAll();

    public void initData(List<T> list);

    public void create(String lastName, String firstName, String middleName);
}
