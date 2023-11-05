import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        WordList obj = new WordList();
        ArrayList<String>wordsRemoved = new ArrayList<>();
        int choice = 0;
        do{
            System.out.println("\n\n******Binary Search Tree******");
            System.out.println("1) Add word");
            System.out.println("2) Remove word");
            System.out.println("3) List all words and meanings");
            System.out.println("4) Exit the program");
            System.out.print("\nYour choice:");
            //get input from user
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.print("Enter word: ");
                String word = sc.nextLine();

                System.out.print("Enter meaning: ");
                String meaning = sc.nextLine();

                obj.insertHelper(word, meaning);
                System.out.println("\n");
            }
            else if(choice == 2){
                obj.inOrder();
                System.out.print("\nEnter word to be removed: ");
                String wordToRemove=sc.next();
                wordsRemoved.add(wordToRemove);
                obj.deleteWord(wordToRemove);
            }
            else if(choice == 3) {
                obj.inOrder();
                System.out.println("\nList of words removed:");
                for (int i = 0; i < wordsRemoved.size();i++)
                {
                    System.out.println(wordsRemoved.get(i));
                }
            }

        }while(choice==1 || choice == 2 || choice == 3);
    }
}
