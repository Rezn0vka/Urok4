package obobcenie.view;

import java.util.List;
import obobcenie.model.User;

public interface UserView<T extends User> {

    public void sendOnConsole(List<T> list);
}
