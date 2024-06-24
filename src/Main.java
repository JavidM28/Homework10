public class Main {
    public static void main(String[] args) {
        //TASK 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        //TASK 2
        System.out.println(fullName.toUpperCase());

        //TASK 3
        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}