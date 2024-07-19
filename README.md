# Password Generator Application ver 1.0 - PASSFORGE
## Overview:
This Java application generates secure and randomised passwords based on user-defined criteria.
## Features:
### 1. Password Generation:
  - **Customisable Length:** Users can specify the desired length of the password, with a minimum requirement of 4 characters.
  - **Character Variety:** The generated password includes a mix of:
    - Uppercase letters (A-Z)
    - Lowercase letters (a-z)
    - Digits (0-9)
    - Special characters (!@#$%^&*()-_=+<>?)
  - **Randomisation:** The password is initialised with the first four characters from all of character types mentioned above to ensure all types are present, and then filled with additional random characters from the combined set of all character types.
### 2. Password Shuffling:
  - **Enhanced Security:** After generating the password, it is shuffled to avoid predictable patterns and increase security. This is done by converting the password to a list of characters, shuffling the list, and then reconstructing the password from the shuffled list.
### 3. User Interface:
  - **Interactive Menu:** The application provides a simple text-based menu to the user, allowing them to either generate a new password or exit the application.
  - **Input Validation:** The application includes robust input validation to handle non-integer inputs and out-of-range choices, guiding the user to enter valid data.
  - **Error Handling:** The application gracefully handles exceptions such as invalid input types and ensures that the user is prompted to correct their inputs.
### 4. User Experience:
  - **Clear Prompts:** The user is guided through the process with clear instructions and error messages, making the application user-friendly.
  - **Loop and Exit Options:** The application operates in a loop, allowing the user to generate multiple passwords in one session or exit as desired.
## Classes:
  - **Generator:**
    - **generatePassword(int length):** Generates a password of the specified length with a mix of uppercase, lowercase, digits, and special characters.
    - **shuffleString(String input):** Shuffles the characters in the given string to ensure a totally random password pattern.
  - **Main:**
    - **User Interface Logic:** Manages the menu display, user input, and interaction with the **Generator** class to produce and display the generated passwords.
## Installation
To install Password Generator, follow these steps:
  1. The application may require Java to run. So, visit this website and download JRE: https://www.java.com/en/
  2. Go to Google Drive with this link: https://drive.google.com/drive/u/0/folders/1oE525y2G2AtG9pnEHpg1VUV1OHG-NG1g
  3. Install the PasswordGenerator.zip
  4. Extract the zip file
  5. Start the application by double clicking the exe file.
## Usage
Once the application is running, you can start using Password Generator by:
  1. Enter the number equivalent to your choice in the menu, and press **Enter**.
  2. Enter the length of the password as you want, and press **Enter**.
  3. After that, you will see a password generated with the entered length.
  4. You may press **Enter** at this point to continue.
## Contact
  - **Email:** HieuJames204@gmail.com
  - **Facebook:** https://www.facebook.com/profile.php?id=100011634061799
  - **Instagram:** https://www.instagram.com/_ryx_204/
  - **X:** https://x.com/HieuNg2004
## Conclusion
This application is designed to help users create strong and secure passwords, adhering to best practices for password complexity and randomness.
