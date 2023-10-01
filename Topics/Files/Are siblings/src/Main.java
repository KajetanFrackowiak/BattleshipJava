import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // Get the parent directories of both files
        File parentDirF1 = f1.getParentFile();
        File parentDirF2 = f2.getParentFile();


        // Check if both parent directories are non-null and equal
        return parentDirF1.equals(parentDirF2);
    }
}
