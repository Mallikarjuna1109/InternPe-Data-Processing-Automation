# InternPe-Data-Processing-Automation
A module built during Internship to automate data processing tasks.


A Java-based mini-project showcasing data processing, automation, object-oriented programming, collections, file handling, and exception handling — developed as part of my internship at InternPe.

This project demonstrates my ability to understand requirements, design modular solutions, write clean and maintainable code, and build efficient components that support backend functionality.

**Features**

- Reads and validates raw data from an input file

- Converts data into structured Java objects (OOP)

- Uses Collections API to sort and process data

- Automates summary generation (total, average, count)

- Handles errors gracefully with exception handling

- Saves processed output to a text file

- Clean, modular, and readable code

- Real-world development workflow simulation


**Project Structure**

InternPe-DataProcessor/

 ├── src/
 │    ├── Main.java
 │    ├── model/
 │    │      └── Record.java
 │    ├── processor/
 │    │      └── DataProcessor.java
 │    └── utils/
 │           └── FileUtils.java
 ├── input.txt
 └── README.md


**How It Works**

1️ Reads data from input.txt

    Example:
    
        Apple, 50
        
        Banana, 30
        
        Orange, 40
        
        Invalid Example Line
        
        Grapes, 20


2️ Parses the data

    Each valid line is converted into a Record object.


3️ Processes the data

    - Sorting
    
    - Filtering invalid lines
    
    - Calculating totals & averages


4️ Generates an output summary

    Saved in output.txt



**Run the Project**

Step 1: Compile

    javac src/**/*.java

Step 2: Run

    java Main

    

**Output example:**

---- **InternPe Data Processing Automation** ----

        Sorted Records:
        
              Grapes -> 20
              
              Banana -> 30
              
              Orange -> 40
              
              Apple -> 50
        
        Processing Completed. Check output.txt



 **Concepts Used**

This project covers all essential backend Java development skills:

           Object-Oriented Programming
               Classes, objects, encapsulation, methods.
          Collections Framework
              ArrayList, sorting, streams.
          File Handling
              Reading and writing files (BufferedReader, BufferedWriter).
          Exception Handling
              Try-catch blocks, handling invalid data.
          Modular Architecture
              Separated into model, processor, and utility packages.


**Purpose of the Project**

This code is a demonstration of the work I did during my internship at InternPe, where I:

            Built Java modules for data processing
            
            Automated backend workflows
            
            Ensured clean and maintainable code
            
            Collaborated with the team to review and debug code
            
            Strengthened analytical and problem-solving skills



**Technologies Used**
          
          Core Java

          Collections Framework
          
          File I/O
          
          Exception Handling
          
          OOP Principles


**Contact**

Kuruva Mallikarjuna

For any queries or collaboration, feel free to connect with me.
