package Excercises;

public class CountTotalCharactersFromStringsWithTwist {
    public static void main(String[] args) {

            String input = " Hie ";
            char[] dataArray = input.toCharArray();
            int count=0;

            for(int index=0;index<dataArray.length;index++){
                if(dataArray[index]==' '){
                    continue;
                }
                boolean whiteSpacePresentAfterTheChar= (index<dataArray.length-1) && dataArray[index+1]==' ';
                boolean whiteSpacePresentBeforeTheChar= (index>0) && dataArray[index-1]==' ';

                if(!whiteSpacePresentAfterTheChar & !whiteSpacePresentBeforeTheChar){
                    count++;
                }
            }

            System.out.println(count);




    }
}
