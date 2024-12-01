package Beta;

class FileProcessorContext {
    private FileProcessorStrategy strategy;
    public void setStrategy(FileProcessorStrategy strategy) {
        this.strategy = strategy;
    }
    public void processFile(String filePath) {
        strategy.read(filePath);
        strategy.parse();
        strategy.save();
    }
}