public class Exercise4_2 {

    public static void main(String[] args) {      // 1
        zippo("rattle", 13);                      // 2
    }

    public static void baffle(String blimp) {     // 5
        System.out.println(blimp);                // 6
        zippo("ping", -5);                        // 7
    }

    public static void zippo(String quince, int flag) {  // 3
        if (flag < 0) {                           // 8
            System.out.println(quince + " zoop"); // 9
        } else {                                  // 4
            System.out.println("ik");             // 5
            baffle(quince);                       // 6
            System.out.println("boo-wa-ha-ha");   // 10
        }
    }
}

Programın tam çıktısı:
ik
rattle
ping zoop
boo-wa-ha-ha

baffle'a ilk gönderilen parametre:
"rattle"
