package com.ekomuliyo.repository;

import com.ekomuliyo.entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository{

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        // cek apakah model penuh
        var isFull = true;
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        // jika penuh, panjang array di kali 2
        if (isFull()) {
            var temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {

        resizeIfFull();

        // menambahkan data di posisi array null
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        // cek jika number melebihi kapasitas array
        if ((number - 1) >= data.length) {
            return false;
        }
        // cek jika data sebelumnya sudah dihapus
        else if (data[number - 1] == null) {
            return false;
        }else {
            System.out.println("Menghapus data nomor " + number);

            // ini menggeser posisi, dimana index yang dimasukan, akan digeser dengan index di depan nya i + 1
            // dan data terkahir di set null, agar tidak indexOutOfBound
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1 )) {
                    data[i] = null;
                }else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
