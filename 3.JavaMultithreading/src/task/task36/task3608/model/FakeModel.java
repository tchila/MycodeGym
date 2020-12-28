package task.task36.task3608.model;


import task.task36.task3608.bean.User;

public class FakeModel implements Model {

    private DataModel dataModel = new DataModel();
    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        dataModel.getUsers().add(new User("A",1,1));
        dataModel.getUsers().add(new User("B",2,1));
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();

    }
}
