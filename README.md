# Enhancement Request Annotation Project

This project demonstrates how to define and use a custom annotation in Java.

The `@EnhancementRequest` annotation is used to describe enhancement requests for classes, with elements for `id`, `synopsis`, `engineer`, and `date`.

# Project Structure

``` Annotations/
 ├── EnhancementRequest.java      # Annotation definition
 
 ├── CacheEnhancement.java        # Example class using the annotation
 
 └── Main.java     # Reads and prints annotation values
```

# How It Works

Define the annotation

`EnhancementRequest.java` specifies the annotation type, including default values for `engineer` (`unassigned`) and date (`unknown`).

Use the annotation

`CacheEnhancement.java` applies the annotation to a class.

Process the annotation

`Main.java` uses reflection to read and print the annotation values at runtime.

# Running the Project

Compile the project:

``` javac *.java ```

Run the annotation processor:

```java AnnotationProcessor```

Expected output:

ID: FlexiSAF-1

Synopsis: Add caching to improve performance

Engineer: unassigned

Date: unknown

# Notes

The `@Target(ElementType.TYPE)` restriction means the annotation can only be applied to classes, interfaces, or enums.

You can extend it to methods or fields by updating the `@Target`.

