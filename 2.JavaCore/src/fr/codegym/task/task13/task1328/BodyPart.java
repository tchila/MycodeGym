package fr.codegym.task.task13.task1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("jambe");
    final static BodyPart HEAD = new BodyPart("tête");
    final static BodyPart ARM = new BodyPart("main");
    final static BodyPart CHEST = new BodyPart("chest");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}