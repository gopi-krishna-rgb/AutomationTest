package Selenium_1;


public class Java_Programming {


    //main method is nothing but the JAVA Compiler recognises the keyword 'main'
    //to execute the programs

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("This is my first coding class");

        String str1, str2, spaces;

        str1 = "This is for practice";
        str2 = "This is foR Practice";

        spaces = "      hello       ";

        System.out.println(str1);

        System.out.println(str1.length());

        System.out.println(str1.charAt(15)); // ex: chatAt(200) --> error be like:: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 150 out of bounds for length 20

        System.out.println(str1.substring(4));

        System.out.println(str1.substring(4,10));

        System.out.println(str1.indent(70));

        System.out.println(str1.replace("practice", "practice purpose"));

        System.out.println(str1.contains("for"));

        System.out.println(spaces.trim());

        System.out.println(spaces.stripLeading());

        System.out.println(spaces.stripTrailing());

        System.out.println(spaces.stripIndent());

        System.out.println(spaces.concat("world"));

        System.out.println(spaces.trim().concat(" world"));

        System.out.println(str1.repeat(5));

        System.out.println(str1.indexOf('p'));

        System.out.println(str1.indexOf('z'));

        System.out.println(str1.indexOf("practice"));

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));

        ///////Wrapper Classes ---- Converts the String into wrapper classes
        System.out.println("WRAPPER CLASSES");

        String p1 = "400000";
        String p2 = "400.52";

        System.out.println(Integer.parseInt(p1));

        System.out.println(Double.parseDouble(p2));

        System.out.println(Float.parseFloat(p2));

        int k1 = 5000;
        System.out.println(String.valueOf(k1));

        double d1= 45.24;
        System.out.println(String.valueOf(d1));

        int a = 356;

        System.out.println("Number Obtained is: " + a);

        System.out.println(STR."Number Obtained is: \{a}");

        //Switch()

        String str = "SwitchCase is Alternative for if else";

        switch (str) {
            case "SwitchCase", "witchCase is Alternative for if else ignoreit" ->
                    System.out.println("the value of str is SwitchCase is Alternative for if else");
            case "is Alternative for if else" ->
                    System.out.println("witchCase is Alternative for if else ignoreit");
            default ->
                    System.out.println("the value of str is not switchCase is Alternative for if else ignoreit");
        }

    }
}



