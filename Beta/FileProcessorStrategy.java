package Beta;
interface FileProcessorStrategy {
    void read(String filePath);     
    void parse();                  
    void save();                   
}