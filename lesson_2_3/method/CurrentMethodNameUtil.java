public class CurrentMethodNameUtil {
    public static String get() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}