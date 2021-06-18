package lesson6.task4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            persons.add(Person.random());
        }

        Map<IdentityDocumentType, Integer> documentTypeCount = new HashMap<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            Integer documentCount = 0;
            for (Person person : persons) {
                if (person.document.getDocumentType().equals(documentType)) {
                    documentCount++;
                }
            }
            documentTypeCount.put(documentType, documentCount);
        }

        List<String> identityDocumentTypeCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            identityDocumentTypeCodes.add(documentType.getCode());
        }
        Collections.sort(identityDocumentTypeCodes);
        Collections.reverse(identityDocumentTypeCodes);

        for (String code : identityDocumentTypeCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.getByCode(code);
            System.out.printf("%s (%s): %d%n", documentType.getDescription(), code, documentTypeCount.get(documentType));
        }

        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getIdentityDocument().getDocumentType().getCode().equals("21"))
                iterator.remove();
        }

        System.out.println("Количество людей в списке: " + persons.size());
    }
}