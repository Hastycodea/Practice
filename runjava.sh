#!/bin/bash

# Check if a Java file is provided as an argument
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <JavaFile.java>"
    exit 1
fi

# Get the Java file name without the extension
JAVA_FILE="$1"
CLASS_NAME="${JAVA_FILE%.java}"

# Compile the Java file
javac "$JAVA_FILE"

# Check if the compilation was successful
if [ $? -eq 0 ]; then
    # Run the compiled Java class
    java "$CLASS_NAME"
else
    echo "Compilation failed."
    exit 1
fi

