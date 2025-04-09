package lecture_5;

import java.io.*;


public class FileProcessing {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");

            // Check if the file exists
            if (!inputFile.exists()) {
                System.err.println("Input file does not exist.");
                return;
            }

            // Create the root directory
            File rootDirectory = new File("root");

            if (rootDirectory.exists()) {
                File[] files = rootDirectory.listFiles();

                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                    if (file.isDirectory()) {

                    }
                }

            }
            if (!rootDirectory.exists()) {
                rootDirectory.mkdir();
            }

            // Read the lines from the input file
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                // Create subfolder for each line
                File subfolder = new File(rootDirectory, "subfolder" + lineNumber);
                subfolder.mkdir();

                // Create a file inside the subfolder and write the line
                File outputFile = new File(subfolder, "output.txt");
                outputFile.createNewFile();
                FileWriter writer = new FileWriter(outputFile);
                writer.write(line);
                writer.close();

                lineNumber++;
            }

            br.close();
            System.out.println("Files and folders created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

