package ru.mirea.guchanova;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Lermontov", "lermontov@mail.ru", 'M');
        System.out.println(a1);
        a1.setEmail("lermontov@yandex.ru");
        System.out.println(a1);
    }
}
