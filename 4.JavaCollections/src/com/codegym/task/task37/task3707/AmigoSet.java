package com.codegym.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map ;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection ) {
        this.map = new HashMap<>((int)Math.max(16,(Math.ceil(collection.size()/.75f))));
        for (E e : collection) {
            this.map.put(e, PRESENT);
        }
    }

    @Override
    public boolean add(Object o) {
         return this.map.put((E) o, PRESENT) == null;


    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
