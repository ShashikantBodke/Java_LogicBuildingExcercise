package Excercises;

public class GenerateAName {
    public static void main(String[] args) {

        //Column By Column Read -- RRaajhul , RRAaamjhiutl

        String[] names = {"Raj","Rahul","Amit"};
        StringBuilder sb = new StringBuilder();
        int maxLength=0;

        for(String name : names){
            if(maxLength<name.length()){
                maxLength=name.length();
            }
        }
        System.out.println(maxLength);

        for(int i=0;i<maxLength;i++){
            for(String name:names){
                if(i<name.length()) {
                    sb.append(name.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
