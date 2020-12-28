package fr.codegym.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishQueue().isEmpty()) {
            if (!manager.getDishQueue().isEmpty()) {       // Apporte le plat préparé
                Dish dish = manager.getDishQueue().poll();
                System.out.println("Le serveur a apporté la commande de la table " + dish.getTableNumber());
            } else {                                         // Prendre une nouvelle commande
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Nous avons reçu une commande de la table " + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  // Marcher jusqu'à la table suivante
            } catch (InterruptedException ignored) {
            }
        }
    }
}
