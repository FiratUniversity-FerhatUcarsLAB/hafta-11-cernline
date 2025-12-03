public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        // Program calisir, ancak degeri kullanilmadigi icin etkisi olmaz.

        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Derleyici hata verir: void method cannot be used in an expression.
    }
}

# Exercise 4.4 Answers

1) Bir değer döndüren metodu çağırıp sonucunu kullanmazsak:  
   Program çalışır ancak dönen değer kullanılmadığı için ek bir çıktı oluşmaz.

2) Void metodu bir ifadenin içinde kullanırsak:  
   Derleme hatası alınır.  
   "void cannot be used in an expression"
