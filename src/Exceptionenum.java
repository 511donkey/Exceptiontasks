import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Exceptionenum {
    public static void main(String[] args) throws AccessDeniedException, FileNotFoundException, JarException {
        Status status = Status.FILE_NOT_FOUND;

        try {
            throwException(status);
        } catch (FileNotFoundException | JarException | AccessDeniedException e) {
            System.out.println(e.getMessage() + " file not found");
        }


        Status status1 = Status.ACCESS_DENIED;

        try {
            throwException(status1);
        } catch (FileNotFoundException | JarException | AccessDeniedException ext) {
            System.out.println(ext.getMessage());
            throw ext;
        }


        Status status2 = Status.JAR_ERROR;

        try {
            throwException(status2);
        } catch (FileNotFoundException | JarException | AccessDeniedException ext1) {
            System.out.println(ext1.getMessage());
            ext1.printStackTrace();
        }


    }


    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) {
            throw new FileNotFoundException("File not found");
        } else if (status.equals(Status.ACCESS_DENIED)) {
            throw new AccessDeniedException("Acces Denied Exception");
        } else if (status.equals(Status.JAR_ERROR)) {
            throw new JarException("Jar Exception");
        }
    }
}


enum Status {
    FILE_NOT_FOUND, ACCESS_DENIED, JAR_ERROR
}

