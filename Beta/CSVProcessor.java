package Beta;

class CSVProcessor implements FileProcessorStrategy {
    @Override
    public void read(String filePath) {
        System.out.println("Reading CSV: " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing CSV");
    }

    @Override
    public void save() {
        System.out.println("Saving data");
    }
}