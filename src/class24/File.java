package class24;

public abstract class File {

    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft Word to be installed etc
    */

    int size;

    abstract void open();

    void edit() {
        System.out.println("File is being edited.");
    }

    void close() {
        System.out.println("File is being closed.");
    }
}

class JavaFile extends File {


    JavaFile(int size) {
        super.size = size;
    }

    @Override
    void open() {
        System.out.println("Installing notepad++. Java opens.");
    }
}

class WordFile extends File {

    WordFile(int size) {
        super.size = size;
    }

    @Override
    void open() {
        System.out.println("Downloading Microsoft Word. Word opens.");
    }
}

class PdfFile extends File {

    PdfFile(int size) {
        super.size = size;
    }

    @Override
    void open() {
        System.out.println("PDF Viewer is cracked. Opens PDF file.");
    }
}
