package OOPs.Abstraction;

abstract class DataProcessor{
    abstract void readData();
    abstract void processData();

    public void execute(){
        readData();
        processData();
    }
}
class ExcelProcessor extends DataProcessor{
    @Override
    void readData() {
        System.out.println("Reading Excel file...");
    }
    void processData(){
        System.out.println("Processing excel Data...");
    }
}
public class TemplateMethod {
    public static void main(String[] args) {
        DataProcessor d = new ExcelProcessor();
        d.execute();

    }
}
