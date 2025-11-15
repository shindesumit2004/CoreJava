package sumit.String;

public class String1 {
    public static void main(String[] args) {

        String name = " Sumit Shinde ";

        System.out.println("Original String : '" + name + "'");  // it is show original string
        System.out.println("Length: " + name.length()); // it is show length of string
        System.out.println("Character at index 3 : " + name.charAt(3)); //it is show which letter is present in this index
        System.out.println("Uppercase: " + name.toUpperCase()); // it is convert all string in uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // it is convert all string in lowercase
        System.out.println("Trimmed: " + name.trim() + "'");// it is remove spaces from for string left/right side
       // System.out.println("Index of substring: " + name.indexOf());

    }
}
