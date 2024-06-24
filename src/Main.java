public class Main {
    public static void main(String[] args) {
        //TASK 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //TASK 2
        System.out.println(fullName.toUpperCase());

        //TASK 3
        String firstNameToFix = "Семён";
        String lastNameToFix = "Иванов";
        String middleNameToFix = "Семёнович";
        firstNameToFix = firstNameToFix.replace("ё", "е");
        lastNameToFix = lastNameToFix.replace("ё", "е");
        middleNameToFix = middleNameToFix.replace("ё", "е");
        String fullNameToFix = lastNameToFix + " " + firstNameToFix + " " + middleNameToFix;
        System.out.println(fullNameToFix);
    }
}