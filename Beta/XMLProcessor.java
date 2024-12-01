package Beta;
class XMLProcessor implements FileProcessorStrategy {
    @Override
    public void read(String filePath) {
        System.out.println("Reading XML: " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing XML.");
    }

    @Override
    public void save() {
        System.out.println("Saving data from XML ");
    }
}