package com.csee.java;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICURD {
    ArrayList<Word> list;
    Scanner s;
    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);
    }

    public void addWord() {
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
    public void listAll() {
        System.out.println("--------------------------------");
        for(int i=0; i<list.size(); i++) {
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("--------------------------------");
    }
    public void listAll(ArrayList<Integer> list2) {
        System.out.println("--------------------------------");
        int j=0;
        for(int i=0; i<list.size(); i++) {
            if(i==list2.get(j)) {
                System.out.print((j + 1) + " ");
                System.out.println(list.get(i).toString());
                j++;
            }
            if(j==list2.size())break;
        }
        System.out.println("--------------------------------");
    }
    public void updateItem() {
        System.out.print("=> 수정할 단어 검색 : ");
        s.nextLine();
        String search = s.nextLine();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getWord().contains(search)) {
                list2.add(i);
            }
        }
        listAll(list2);
        System.out.print("=> 수정할 번호 선택 : ");
        int num = s.nextInt();
        System.out.print("=> 뜻 입력 : ");
        s.nextLine();
        String meaning = s.nextLine();
        list.get(list2.get(num-1)).setMeaning(meaning);
    }

    public void deleteItem() {
    }
}
