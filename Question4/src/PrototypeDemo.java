
// Demonstrates cloning a Document object using the Prototype Pattern.

public class PrototypeDemo {

    public static void main(String[] args) {

        // Create the original document
        Document originalDoc = new Document(
                "Report",
                "This is the original document content."
        );

        // Clone the document
        Document clonedDoc = originalDoc.clone();

        // Modify the cloned document
        clonedDoc.setTitle("Cloned Report");
        clonedDoc.setContent("This content belongs to the cloned document.");

        // Show original document
        System.out.println("Original Document:");
        System.out.println("Title: " + originalDoc.getTitle());
        System.out.println("Content: " + originalDoc.getContent());
        System.out.println();

        // Show cloned document
        System.out.println("Cloned Document:");
        System.out.println("Title: " + clonedDoc.getTitle());
        System.out.println("Content: " + clonedDoc.getContent());
    }
}

