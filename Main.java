public class Main {
    public static void main(String[] args) {
        Class<CacheEnhancement> classic = CacheEnhancement.class;

        // Check if the annotation is present
        if (classic.isAnnotationPresent(EnhancementRequest.class)) {
            EnhancementRequest er = classic.getAnnotation(EnhancementRequest.class);

            // Print annotation values
            System.out.println("ID: " + er.id());
            System.out.println("Synopsis: " + er.synopsis());
            System.out.println("Engineer: " + er.engineer());
            System.out.println("Date: " + er.date());
        }
    }
}
