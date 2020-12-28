package com.codegym.task.task31.task3110;

public enum Operation {
    CREATE("Zip files into an archive"),
    ADD("Add a file to an archive"),
    REMOVE("Remove a file from an archive"),
    EXTRACT("Extract an archive"),
    CONTENT("View the contents of an archive"),
    EXIT("Exit");

    String description;

    Operation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
