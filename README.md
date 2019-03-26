# Multi-Module-Maven-Project-Using-Java
This project has done to understand the concept of Maven multi-module    
In the parent Module there are two sub-modules  
  i)  Core  
  ii) Service  
In the Core three sorting classes and one Interface has implemented   
This project Takes Command Line arguments and sort the numbers and return with the time it took to sort the number array in nano seconds  
In order to use JUnit5 add following dependencies to main pom
  
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-params</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>
    
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>

## Built With
* Maven - Dependency Management
* Java 
* JUnit 5
* Maven surefire 

## Authors
* Madushan Dinusha
