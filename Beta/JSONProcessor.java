package Beta;
class JSONProcessor implements FileProcessorStrategy {
    @Override
    public void read(String filePath) {
        System.out.println("Reading JSON " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing JSON file");
    }

    @Override
    public void save() {
        System.out.println("Saving data from JSON ");
    }
}