package task.task36.task3608.view;


import task.task36.task3608.bean.User;
import task.task36.task3608.controller.Controller;
import task.task36.task3608.model.DataModel;

public class UsersView implements View {

    private Controller controller;


    @Override
    public void refresh(DataModel dataModel) {
        if(!dataModel.isDisplayDeletedUserList())
            System.out.println( "All users:");
        else
            System.out.println( "All deleted users:");


        for (User user: dataModel.getUsers()) {
            System.out.println("\t"+user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireShowAllUsersEvent(){
        controller.onShowAllUsers();
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }

    public void fireOpenUserEditFormEvent(long id) {
        controller.onOpenUserEditForm(id);
    }

}
