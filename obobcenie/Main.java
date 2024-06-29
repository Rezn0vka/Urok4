package obobcenie;

import obobcenie.controll.TeacherControll;

public class Main {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Чалышев", "Денис", "Антонович");
        teacherController.create("Химушин", "Радик", "Александрович");
        teacherController.create("Егудин", "Александр", "Егорович");
        teacherController.create("Кузяев", "Владимир", "Георгиевич");
        teacherController.printTeachers();
        System.out.println("Меняем учителя с TeacherID = 2");
        teacherController.editTeacher(2, "Стриханов", "Ян", "Ильдарович");
        teacherController.printTeachers();

    }
}
