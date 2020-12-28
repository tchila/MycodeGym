package fr.codegym.task.task14.task1411;

public interface Person {
    class User implements Person {
        void live() {
            System.out.println("Je me contente de vivre.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("Je ne fais généralement rien.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("J'écris généralement du code.");
        }
    }

    class Programmer implements Person {
        void enjoy() {
            System.out.println("La vie est belle !");
        }
    }

}
