package com.example.util;

public interface List extends Collection{
    boolean add(int index,String e);
    String get(int index);
    String set(int index,String e);
    String remove(int index);
}
