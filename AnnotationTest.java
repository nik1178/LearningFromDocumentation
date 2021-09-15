@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

@ClassPreamble(
    author = "Nik Jenic",
    date = "dapsjdsa",
    reviewers = {"me", "myself", "i"}
)
public class AnnotationTest {
    
}
