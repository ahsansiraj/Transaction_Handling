package dsa_questions.src.ISCPrograms;

public class hammingdistance {
    public int hammingWeight(int n) {
        int count=0;
        String binary = Integer.toBinaryString(n);
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        hammingdistance obj=new hammingdistance();
        int d=obj.hammingWeight(11);
        System.out.println(d);
    }
}
