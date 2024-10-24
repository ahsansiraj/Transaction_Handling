package dsa_questions.src.StringsPractise;

class Tester{

    public static String removeWhiteSpaces(String str){
        //Implement your code here and change the return value accordingly
        String str2=str = str.replaceAll("\\s+","");
        return str2;
    }

    public static void main(String args[]){
        String str = "Hello   How are you   ";
        str = removeWhiteSpaces(str);
        System.out.println(str);
    }
}