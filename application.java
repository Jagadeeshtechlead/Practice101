// File: MyClass.java

// A class with public access specifier
public class MyClass {
    
    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

#Feature202 changes added by Vivek for the payment gateway in Jul2024

public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();

        // Accessing protected members through a public method
        myDog.displayInfo();
    }
}
#End of Feature202 code

#Feature201 changes added by Vinay for the payment gateway in Jul2024

// A class with protected access specifier
public class Animal {
    
    // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
#End of Feature201 code

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
    }
}