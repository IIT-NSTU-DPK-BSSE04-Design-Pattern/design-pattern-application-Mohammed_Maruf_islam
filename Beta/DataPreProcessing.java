package Beta;
public class DataPreProcessing {
    public static void main(String[] args) {
        FileProcessorContext fileProcessor = new FileProcessorContext();
        System.out.println("Processing CSV:");
        fileProcessor.setStrategy(new CSVProcessor());
        fileProcessor.processFile("data.csv");

        System.out.println("\nProcessing JSON:");

        fileProcessor.setStrategy(new JSONProcessor());
        fileProcessor.processFile("data.json");

        System.out.println("\nProcessing XML:");

        fileProcessor.setStrategy(new XMLProcessor());
        fileProcessor.processFile("data.xml");
    }
}
