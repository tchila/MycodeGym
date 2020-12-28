package fr.codegym.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Le chef est en pause");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // Le chef prend une commande dans la file d'attente
        System.out.println(String.format("La commande sera prête dans %d ms pour la table %d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // Préparer le plat
        Dish dish = new Dish(order.getTableNumber());       // Ceci est un plat préparé
        manager.getDishQueue().add(dish);
        System.out.println(String.format("La commande pour la table %d est prête", dish.getTableNumber()));
    }
}
