package Excercises;

public class NameShortener {

    public static void main(String[] args) {
        String input = "Shashikant Raghunath Bodke";
        String[] inputArray = input.trim().split(" ");

        if(inputArray.length < 2) {
            System.out.println("input");
        }else {
            StringBuilder sb = new StringBuilder();
            for (int index=0; index < inputArray.length - 1; index++) {
                sb.append(inputArray[index].charAt(0)).append(". ");
            }
            System.out.println("Shortened Name: " +sb.toString() + inputArray[inputArray.length - 1]);
        }
    }
}

