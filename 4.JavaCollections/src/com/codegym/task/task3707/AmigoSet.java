package com.codegym.task.task3707;

import com.codegym.task.task37.task3707.HashMapReflectionHelper;
import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    public Iterator<E> iterator()
    {
       return this.map.keySet().iterator();
    }

    @Override
    public int size() {

        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {

        return this.map.containsKey(o);
    }

    @Override
    public Object clone()  {
        try {
        AmigoSet cloneSet = (AmigoSet) super.clone();
        cloneSet.map = (HashMap) map.clone();
        return cloneSet;
        }catch (Exception e){
            throw new InternalError(e);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {

        
        out.defaultWriteObject();

        out.writeObject(map.size());
        for(E e:map.keySet()){
            out.writeObject(e);
        }
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"capacity"));
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));


    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {


        in.defaultReadObject();
        int size = (int)in.readObject();

        Set<E> set = new HashSet<>();
        for(int i =0;i<size;i++){
            set.add((E)in.readObject());
        }
        int capacity = (int)in.readObject();
        float loadFactor = (float)in.readObject();
        map = new HashMap<>(capacity,loadFactor);
        for(E e:set){
            map.put(e,PRESENT);
        }

    }

    @Override
    public boolean remove(Object o) {
        return this.map.remove(o) == null;
    }

    @Override
    public void clear() {
        this.map.clear();
    }
}
