Binary Search Tree Dictionary in Java
Description
This Java program implements a simple dictionary using a Binary Search Tree (BST) data structure. It allows users to add words with their meanings, remove words, and list all words with their meanings. The program is designed to demonstrate basic BST operations in a Java application.

Features
Add Words: Users can add new words along with their meanings to the dictionary.
Remove Words: Users can remove words from the dictionary.
List Words: Displays all words and their meanings in the dictionary.
Track Removed Words: Maintains a list of words that have been removed.
How to Run
Ensure you have Java installed on your system.
Compile the Java files Dictionary.java and WordList.java.
Run the Dictionary class.
Usage
After running the program, you will be presented with a menu:

Add word
Remove word
List all words and meanings
Exit the program
Select an option by entering the corresponding number. Follow the prompts to add or remove words, or to list all words in the dictionary.

Classes
Dictionary
The main class that drives the program. It handles user input and interacts with the WordList class to perform dictionary operations.

WordList
This class represents the dictionary and encapsulates the BST logic. It includes methods for adding, removing, searching, and listing words and their meanings.

WordMeaningNode
A nested static class within WordList representing nodes in the BST. Each node contains a word, its meanings, and pointers to its left and right children.

Limitations & Future Improvements
The current implementation does not persist data between runs.
Enhancements can include a GUI for better user interaction and file-based persistence for storing dictionary entries.
Contributing
Contributions to the project are welcome. Please ensure to follow best coding practices and add relevant comments to your code.
