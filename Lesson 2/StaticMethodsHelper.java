public class StaticMethodsHelper {
    public static String getInitMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}