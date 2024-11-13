# Random IP Generator and Classifier

## Overview
This Java-based application generates random IP addresses and classifies them into the appropriate IP class (A, B, C, D, or E) based on the first octet of the generated IP. The project is useful for network analysis, penetration testing, or educational purposes, and can be modified to generate IPs within specific ranges.

## Features
- Generates random IPv4 addresses within a specified range.
- Classifies the generated IP address into one of the IP classes (A, B, C, D, or E).
- Simple command-line interface.
- Provides a clean and easy-to-read output displaying the generated IP and its class.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/LynxAlcyoneus/RndIPgenerator.git
    ```

2. Navigate to the project directory:
    ```bash
    cd RndIPgenerator
    ```

3. Ensure you have [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.

4. Compile the Java files:
    ```bash
    javac IpGen.java
    ```

5. Run the application:
    ```bash
    java IpGen
    ```

## Usage
When you run the application, it will generate a random IP address within the range of `10.0.0.0` to `254.254.254.254` (configurable), and classify the IP address based on its first octet.

