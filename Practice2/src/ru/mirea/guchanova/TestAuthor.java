package ru.mirea.guchanova;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Igor", "Igor123@mail.ru", 'M');
        System.out.println(a1);
        a1.setEmail("Igor321@yandex.ru");
        System.out.println(a1);
    }
}
