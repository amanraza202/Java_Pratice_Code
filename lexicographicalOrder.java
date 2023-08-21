public class lexicographicalOrder {
    public static void main(String[] args) {
        String str[] = {"abaya","lime","watermelon","apple","mango","kiwi"};
        for(int i =0; i<str.length; i++){
            int min_index = i;

            for(int j = i+1; j<str.length; j++){
                if(str[j].compareTo(str[min_index])<0){
                    min_index = j;
                }
            }

            String temp = str[i];
            str[i] = str[min_index];
            str[min_index] = temp;

        }

        for (String string : str) {
            System.out.print(string + " ");
        }

    }
}
