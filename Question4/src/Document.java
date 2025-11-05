// Document.java
// Demonstrates the Prototype Pattern by implementing deep cloning.

public class Document implements Cloneable {

    private String title;
    private String content;

    // Constructor to initialize fields
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter methods (optional, for displaying data)
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Setter methods (for modifying the clone in the demo)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Overriding clone() to create a deep copy
    @Override
    public Document clone() {
        try {
            // super.clone() gives a shallow copy,
            // but since we only have primitive/String fields, this becomes deep enough.
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }
}

