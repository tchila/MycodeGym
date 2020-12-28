package com.codegym.task.task20.task2028;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

/* 
Build a tree (part 1)

*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    int size;


    List<Entry<String>> nodesThatNeedChildren = new ArrayList();
    Queue<Entry<String>> tmpQueue = new LinkedList();

    public CustomTree() {
        this.root = new Entry<>("0");
        this.root.parent = this.root;
        size = 1;
    }

    @Override
    public String get(int index) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) throws UnsupportedOperationException {
        return super.set(index, element);
    }

    @Override
    public void add(int index, String element) throws UnsupportedOperationException{
        super.add(index, element);
    }

    @Override
    public boolean add(String s) {
         genList(root);

         if(nodesThatNeedChildren.get(0).isAvailableToAddChildren()){
             return addNode(s);

         }else {
             while (!nodesThatNeedChildren.get(0).isAvailableToAddChildren()){
                 nodesThatNeedChildren.remove(0);
             }
             return addNode(s);

         }
    }

    private boolean addNode(String s) {
        if(nodesThatNeedChildren.get(0).availableToAddLeftChildren){
            Entry<String> nodeToAdd = new Entry<>(s);
            nodeToAdd.parent = nodesThatNeedChildren.get(0);
            nodesThatNeedChildren.get(0).leftChild = nodeToAdd;
            nodesThatNeedChildren.get(0).availableToAddLeftChildren = false;
            size+=1;
            return true;
        }else {
            Entry<String> nodeToAdd = new Entry<>(s);
            nodeToAdd.parent = nodesThatNeedChildren.get(0);
            nodesThatNeedChildren.get(0).rightChild = nodeToAdd;
            nodesThatNeedChildren.get(0).availableToAddRightChildren = false;
            size+=1;
            return true;
        }
    }

    public void genList(Entry<String> root){
        nodesThatNeedChildren.clear();
        nodesThatNeedChildren.add(root);

        tmpQueue.clear();
        tmpQueue.add(root);

        while (!tmpQueue.isEmpty()){
            Entry<String> node = tmpQueue.poll();

            if(node.leftChild != null){
                tmpQueue.add(node.leftChild);
                nodesThatNeedChildren.add(node.leftChild);
            }

            if(node.rightChild != null){
                tmpQueue.add(node.rightChild);
                nodesThatNeedChildren.add(node.rightChild);
            }

        }
    }

    @Override
    public String remove(int index) throws UnsupportedOperationException{
        return super.remove(index);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();

    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) throws UnsupportedOperationException{
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public int size() {
        genList(root);
        return nodesThatNeedChildren.size()-1;
    }

    @Override
    public boolean remove(Object o) throws UnsupportedOperationException {
        if((!(o instanceof String)))
            throw new UnsupportedOperationException();
        String s  = (String) o;
        genList(root);
        for (int i = 0; i < nodesThatNeedChildren.size(); i++) {
            if(nodesThatNeedChildren.get(i).elementName.equals(s)){
                    remove(nodesThatNeedChildren.get(i));
                    break;
            }

        }
        return false;
    }

    void remove(Entry<String> node){

        if(node.isAvailableToAddChildren()) {
            if (node.parent.rightChild == node) {
                node.parent.rightChild = null;
                node.parent.availableToAddRightChildren = true;
                node.parent = null;
                return;
            } else {
                node.parent.leftChild = null;
                node.parent.availableToAddLeftChildren = true;
                node.parent = null;
                return;
            }

        }
        if(node.rightChild != null)
            remove(node.rightChild);
        if(node.leftChild != null)
            remove(node.leftChild);
        remove(node);

    }

    public String getParent(String s) {
        genList(root);
        for (Entry<String> nodesThatNeedChild : nodesThatNeedChildren) {
            if(nodesThatNeedChild.elementName.equals(s)){
                return nodesThatNeedChild.parent.elementName;
            }
        }
        return null;
    }

    static class Entry<T> implements Serializable{
        String elementName;
        boolean  availableToAddLeftChildren, availableToAddRightChildren;
        Entry <T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren(){
            return this.availableToAddRightChildren || this.availableToAddLeftChildren;
        }
    }


}
