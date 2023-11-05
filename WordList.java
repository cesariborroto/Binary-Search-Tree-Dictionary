import java.util.ArrayList;
import java.util.Stack;

public class WordList {
    WordMeaningNode root;
    public static class WordMeaningNode{
        WordMeaning entry;
        WordMeaningNode left, right;
        ArrayList <String> meaningArray = new ArrayList<>();

        static class WordMeaning {
            String word;
            String meaning;
            //Constructor
            public WordMeaning(String word, String meaning) {
                this.word = word;
                this.meaning = meaning;
            }
        }

        //Constructor
        public WordMeaningNode(String word, String meaning) {

            entry = new WordMeaning(word, meaning);
            this.left = null;
            this.right = null;
        }
    }

    WordMeaningNode insert(WordMeaningNode root, String word, String meaning) {
        //tree is empty
        if (root == null){
            root = new WordMeaningNode(word,meaning);
            root.meaningArray.add(root.entry.meaning);
            return root;
        }
        //traverse the tree
        //insert in the left subtree
        if(word.compareTo(root.entry.word)<0)     //insert in the left subtree
            root.left = insert(root.left, word, meaning);
        else if (word.compareTo(root.entry.word)>0)    //insert in the right subtree
            root.right = insert(root.right, word, meaning);
        // return pointer
        else{
            root.meaningArray.add(meaning);
        }
        return root;
    }
     void insertHelper(String word, String meaning){
        root = insert(root, word, meaning);
    }

    void inOrder() {
        System.out.println("\nList of words:");
        inOrderRecursive(root);
    }

    // recursively traverse the BST
    void inOrderRecursive(WordMeaningNode root) {
        int counter = 0;
        if (root != null) {
            inOrderRecursive(root.left);
            if(root.meaningArray!=null){
                System.out.printf("%-15s",root.entry.word);


                for(int i = 0; i<root.meaningArray.size(); i++){
                    counter++;
                    if(counter==1){
                        System.out.printf("%-15s%n","- "+ root.meaningArray.get(i));
                    }else{
                        System.out.printf("               %-15s%n","- "+ root.meaningArray.get(i));
                    }
                    //System.out.printf("'%10s'%n", "word");

                }
            }
            inOrderRecursive(root.right);
        }
    }

    boolean search(String word){
        root = searchRecursive(root, word);
        if (root!= null)
            return true;
        else
            return false;
    }

    //recursive insert function
    WordMeaningNode searchRecursive(WordMeaningNode root, String word){
        // Base Cases: root is null or key is present at root
        if (root==null || root.entry.word==word)
            return root;
        // compare words
        if (root.entry.word.compareTo(word)>0)
            return searchRecursive(root.left, word);
        // compare words
        return searchRecursive(root.right, word);
    }

    //delete a node from BST
    void deleteWord(String word) {
        root = deleteWordRecursive(root, word);
    }

    //recursive delete function
    WordMeaningNode deleteWordRecursive(WordMeaningNode root, String word)  {
        //tree is empty
        if (root == null)
            return root;

        //traverse the tree
        if (word.compareTo(root.entry.word) < 0)     //traverse left subtree
            root.left = deleteWordRecursive(root.left, word);
        else if (word.compareTo(root.entry.word) > 0)  //traverse right subtree
            root.right = deleteWordRecursive(root.right, word);
        else  {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            WordMeaningNode current = new WordMeaningNode("","");
            //current.right.left=current.left;
            current = root;
            root = minValue(root.right);
            root.left=current.left;

            // Delete the inorder successor
            root.right = deleteWordRecursive(root.right, root.entry.word);
        }
        return root;
    }

    WordMeaningNode minValue(WordMeaningNode root)  {
        //find minValue
        while (root.left != null)  {
            root = root.left;
        }
        return root;
    }
}
