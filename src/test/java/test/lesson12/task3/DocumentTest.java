package test.lesson12.task3;

import Lesson12.task3.document.*;
import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DocumentTest {
    private final String PATH = "src\\main\\java\\Lesson12\\task3\\document\\document.json";

    @Test
    @DisplayName("Проверка корректности десериализации класса document")
    void testPersonDeserialization() throws IOException {
        List<String> content = Files.readAllLines(Paths.get(PATH));
        String documentToString = String.join("", content);
        Document document = new Gson().fromJson(documentToString, Document.class);

        Client expectedClient = new Client(657376, 9479, "6449042973", "ООО \"Рога и копыта\"", "1026401974972");
        Status expectedStatus = new Status("SIGNED", "Подписан", null, null, null);
        IdentityDocType expectedIdentityDocType = new IdentityDocType(13, 0, 21, new Language("Паспорт гражданина РФ"), "MANDATORY", "MANDATORY");
        IdentityDocument expectedIdentityDocument = new IdentityDocument(expectedIdentityDocType, "7009", "894549", "2016-09-29", "mZeJHLTRlb", "885236", "WiImcktJhx", "ndsFuaNGCB", "HBKdCEImRV");
        Branch expectedBranch = new Branch(97, 19, null, null, "ОФИС В Г.НОРИЛЬСКЕ", "Europe/Moscow", null, true, "1234");
        Account expectedAccount = new Account(76827485, 332, "40701810683938574392", "042201234", expectedBranch);
        Bank expectedBank = new Bank(1234, 0, "042201234", null, null, null);
        BankAccount expectedBankAccount = new BankAccount(expectedAccount, expectedBank);
        OperBranch expectedOperBranch = new OperBranch(expectedBranch, expectedBank);
        Currency expectedCurrency = new Currency(156, 0, "RUR", "810", "российский рубль");
        List<SymbolAmount> expectedSymbolAmounts = Arrays.asList(
                new SymbolAmount("43000.00", new CashSymbol(40, null, "80", "Поступления наличных денег через банкоматы кредитных организаций", null, null))
        );
        List<CashQuantity> expectedCashQuantities = Arrays.asList(
                new CashQuantity(8, new Cash(null, null, null, 5000.0, "5000,00 руб.", false)),
                new CashQuantity(1, new Cash(null, null, null, 2000.0, "2000,00 руб.", false)),
                new CashQuantity(1, new Cash(null, null, null, 1000.0, "1000,00 руб.", false))
        );

        Assertions.assertEquals(expectedClient, document.getClient());
        Assertions.assertEquals(expectedStatus, document.getStatus());
        Assertions.assertEquals(expectedIdentityDocument, document.getIdentityDocument());
        Assertions.assertEquals(expectedBankAccount, document.getBankAccount());
        Assertions.assertEquals(expectedOperBranch, document.getOperBranch());
        Assertions.assertEquals(expectedCurrency, document.getCurrency());
        Assertions.assertEquals(expectedSymbolAmounts, document.getSymbolAmounts());
        Assertions.assertEquals(expectedCashQuantities, document.getCashQuantities());

        Document expectedDocument = new Document(3163, 2663, "0000000441|00000000000000003163", 188, "WEB", 15,
                "2020-09-25", "4", null, expectedClient, expectedStatus, new ArrayList<>(), null, expectedIdentityDocument,
                null, expectedBankAccount, expectedOperBranch, "2020-10-02", "OabGcWdoxv", expectedCurrency, 43000.00d,
                expectedSymbolAmounts, expectedCashQuantities, null, null, new ArrayList<>(), null, null, null, false);

        Assertions.assertEquals(expectedDocument, document);
    }
}