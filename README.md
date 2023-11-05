# Dictionary Program

This Java program implements a simple dictionary using a binary search tree. It allows users to add words with meanings, list all words and their meanings, and remove words from the dictionary.

## Features

- **Add Word**: Users can add new words along with their meanings to the dictionary.
- **Remove Word**: Users can remove words from the dictionary.
- **List Words and Meanings**: Displays all the words in the dictionary along with their meanings.
- **Track Removed Words**: Keeps a list of all the words that have been removed from the dictionary.

## Classes

The program consists of two main classes:

### `Dictionary`

This is the main class that provides the user interface for interacting with the dictionary. It handles user inputs and displays the appropriate outputs.

### `WordList`

This class manages the internal workings of the dictionary. It includes methods for inserting, deleting, and listing words and meanings. It uses a binary search tree for storing the words.

## Data Structure

The program uses a binary search tree (BST) for efficient storage and retrieval of words. Each node in the BST represents a word and its meanings.

### `WordMeaningNode`

This nested static class within `WordList` represents the nodes of the binary search tree. Each node contains a word, its meanings, and references to its left and right children in the tree.

## Usage

1. **Add a Word**: Select option 1, then enter the word and its meaning.
2. **Remove a Word**: Select option 2, then enter the word to remove.
3. **List All Words**: Select option 3 to see all words and their meanings, along with a list of removed words.
4. **Exit**: Select option 4 to exit the program.

## Compilation and Execution

Compile the Java files and run the `Dictionary` class to start the program.

