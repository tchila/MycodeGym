package com.codegym.task.task38.task3810;

public @interface Revision {
    int revision();
    Date date()  ;
    String comment() default "";
    Author[] authors() default {};
    // Write your own code
}