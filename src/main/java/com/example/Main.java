package com.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> names= List.of("yamada","yasuda","suzuki","kana","momo");
        List<String>result=names.stream().filter(name->name.startsWith("m")).toList();
        System.out.println(result);
        }
    }
