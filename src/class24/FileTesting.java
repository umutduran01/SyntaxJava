package class24;

public class FileTesting {
    public static void main(String[] args) {

        File[] arrFiles = {new JavaFile(1024), new WordFile(100), new PdfFile(52)};

        for (File files : arrFiles
        ) {
            files.open();
            files.edit();
            files.close();
            System.out.println();
        }
    }
}
