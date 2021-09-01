package lesson10.task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class FileGen {
    private Properties properties;
    private Integer amount;
    private List<Integer> sizes;
    private List<String> extensions;

    public FileGen(Integer amount, List<Integer> sizes, List<String> extensions) {
        this.amount = amount;
        this.sizes = sizes;
        this.extensions = extensions;
        initValues();
    }

    public FileGen() {
        initValues();
    }

    public FileGen(Integer amount) {
        this.amount = amount;
        initValues();
    }

    public FileGen(List<Object> unknownParameter) {
        initParameter(unknownParameter);
        initValues();
    }

    public FileGen(Integer amount, List<Object> unknownParameter) {
        this.amount = amount;
        initParameter(unknownParameter);
        initValues();
    }

    public void initValues() {
        try {
            properties = new Properties();
            this.properties.load(new FileReader("src\\main\\java\\lesson10\\task3\\application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (amount == null) {
            this.amount = Integer.parseInt(properties.getProperty("filegen.amount", "0"));
        }
        if (sizes == null) {
            List<Integer> sizesTemp = new ArrayList<>();
            int minSize = Integer.parseInt(properties.getProperty("filegen.minsize", "100"));
            int maxSize = Integer.parseInt(properties.getProperty("filegen.maxsize", "10000"));
            for (int i = 0; i < this.amount; i++) {
                sizesTemp.add(new Random().nextInt(maxSize - minSize + 1) + minSize);
            }
            this.sizes = sizesTemp;
        }
        if (extensions == null) {
            List<String> extensionsTemp = new ArrayList<>();
            String[] extensionsStr = (properties.getProperty("filegen.extensions", "TXT")).split(",");
            for (int i = 0; i < this.amount; i++) {
                extensionsTemp.add(extensionsStr[new Random().nextInt(extensionsStr.length)]);
            }
            this.extensions = extensionsTemp;
        }
    }

    public List<File> generate() throws IOException {
        List<File> files = new ArrayList<>();
        Path pathToFolder = Paths.get(properties.getProperty("filegen.outputfolder", "src\\main\\java\\lesson10\\task3\\output2"));
        if (!Files.exists(pathToFolder)) {
            Files.createDirectory(pathToFolder);
        }
        for (int i = 0; i < amount; i++) {
            Path pathToFile = Paths.get(pathToFolder
                    + "\\generatedFile"
                    + (new Random().nextInt(900000) + 100000)
                    + "."
                    + extensions.get(i));
            File file = new File(pathToFile.toString());
            byte[] content = new byte[sizes.get(i)];
            Files.write(pathToFile, content);
            files.add(file);
            System.out.printf("%s : %d%n", file.getName(), file.length());
        }
        System.out.println("-----");
        return files;
    }

    private void initParameter (List<Object> unknownParameter){
        if (unknownParameter.get(0) instanceof Integer) {
            List<Integer> sizes = new ArrayList<>();
            for (Object object : unknownParameter) {
                sizes.add((Integer) object);
            }
            this.sizes = sizes;
        }
        if (unknownParameter.get(0) instanceof String) {
            List<String> extensions = new ArrayList<>();
            for (Object object : unknownParameter) {
                extensions.add((String) object);
            }
            this.extensions = extensions;
        }
    }
}