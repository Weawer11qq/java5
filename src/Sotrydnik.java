public class Sotrydnik {
    String FIO, position, email;
    int ZP, age;

    Sotrydnik(String FIO, String position, String email, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.ZP = ZP;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("FIO: " + FIO + " | position: " + position
                + " | email: " + email + " | ZP: " + ZP + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

