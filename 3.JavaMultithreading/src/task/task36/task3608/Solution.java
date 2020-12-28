package task.task36.task3608;


import task.task36.task3608.controller.Controller;
import task.task36.task3608.model.MainModel;
import task.task36.task3608.model.Model;
import task.task36.task3608.view.EditUserView;
import task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        usersView.fireShowAllUsersEvent();
        controller.setEditUserView(editUserView);
        usersView.fireOpenUserEditFormEvent(126l);
        editUserView.setController(controller);
        editUserView.fireUserDeletedEvent(124l);
        editUserView.fireUserDataChangedEvent("toto",124, 2);
        //controller.setUsersView(usersView);
        usersView.fireShowDeletedUsersEvent();
    }
}