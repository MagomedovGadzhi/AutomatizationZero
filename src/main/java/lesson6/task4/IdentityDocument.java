package lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private IdentityDocumentType documentType;
    private String id;

    public IdentityDocument(IdentityDocumentType documentType, String id) {
        this.documentType = documentType;
        this.id = id;
    }

    public IdentityDocumentType getDocumentType() {
        return documentType;
    }

    public static IdentityDocument random() {
        int documentTypeCount = IdentityDocumentType.values().length;
        IdentityDocumentType RandomDocumentType = IdentityDocumentType.values()[new Random().nextInt(documentTypeCount)];
        String randomId = StringGenerator.generate(RandomDocumentType);
        return new IdentityDocument(RandomDocumentType, randomId);
    }
}