public class comarison {
    public static void main(String[] args) {
        String name="ahsan";
        String name2="ahsan";
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==name.charAt(i))
            {
                System.out.println(true);
                break;
            }
            else {
                System.out.println(false);
                break;
            }
        }
    }
}
