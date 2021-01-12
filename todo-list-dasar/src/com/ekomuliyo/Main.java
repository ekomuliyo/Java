package com.ekomuliyo;

import java.util.Scanner;

public class Main {

    public static String[] model = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        viewShowTodoList();
    }

    /**
     * Menempilkan todo list
     */
    public static void showTodoList(){
        System.out.println("------TODOLIST------");
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * menambah todo list
     */
    public static void addTodoList(String todo) {

        // cek apakah model penuh
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, panjang array di kali 2
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // menambahkan data di posisi array null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * menghapus todo list
     */
    public static boolean removeTodoList(Integer number) {

        // cek jika number melebihi kapasitas array
        if ((number - 1) >= model.length) {
            return false;
        }
        // cek jika data sebelumnya sudah dihapus
        else if (model[number - 1] == null) {
            return false;
        }else {
            System.out.println("Menghapus data nomor " + number);

            // ini menggeser posisi, dimana index yang dimasukan, akan digeser dengan index di depan nya i + 1
            // dan data terkahir di set null, agar tidak indexOutOfBound
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1 )) {
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * menampilkan view show
     */
    public static void viewShowTodoList() {

        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan anda salah");
            }
        }
    }

    /**
     * menampilkan view tambah
     */
    public static void viewAddTodoList() {
        System.out.println("MENMAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");
        if (todo.equals("x")) {
            // batal
        }else {
            addTodoList(todo);
        }
    }

    /**
     * menampilkan view hapus
     */
    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")) {
            // batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist : " +number);
            }
        }
    }

}
