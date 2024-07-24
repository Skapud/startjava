public class Wind {
    public static String methodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}