package task.task36.task3608.model;


import task.task36.task3608.bean.User;
import task.task36.task3608.model.service.UserService;
import task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {

    private DataModel dataModel = new DataModel();
    private UserService userService = new UserServiceImpl();
    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {

        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());
    }

    public void loadDeletedUsers() {
        dataModel.setDisplayDeletedUserList(true);
        dataModel.setUsers(userService.getAllDeletedUsers());
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        dataModel.setActiveUser(user);
    }

    public void deleteUserById(long id){
        userService.deleteUser(id);
        dataModel.setUsers(getAllUsers());

    }

    private List<User> getAllUsers(){
        List users =userService.getUsersBetweenLevels(1,100);
        return userService.filterOnlyActiveUsers(users);
    }

    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name,id,level);
        dataModel.setUsers(getAllUsers());
    }

}
