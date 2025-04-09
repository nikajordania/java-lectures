package lecture_5;

import java.io.File;

public class DirectoryDelete {
    public static void main(String[] args) {
        File folderToDelete = new File("root");
        try {
            deleteFolder(folderToDelete);
            System.out.println("Folder deleted successfully.");
        } catch (Exception e) {
            System.err.println("Failed to delete folder: " + e.getMessage());
        }
    }

    public static void deleteFolder(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file);
                }
            }
        }
        folder.delete();
    }
}
