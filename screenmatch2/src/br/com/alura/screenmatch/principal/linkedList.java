package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class linkedList implements List<Titulo> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Titulo> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Titulo titulo) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Titulo> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Titulo> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Titulo get(int index) {
        return null;
    }

    @Override
    public Titulo set(int index, Titulo element) {
        return null;
    }

    @Override
    public void add(int index, Titulo element) {

    }

    @Override
    public Titulo remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Titulo> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Titulo> listIterator(int index) {
        return null;
    }

    @Override
    public List<Titulo> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
