import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class OnlineShopSupport {

    public static HashMap<String, BigDecimal> map  = new HashMap<>() {{
        put("Джубашвили", BigDecimal.valueOf(1234567891));
        put("Джубаил", BigDecimal.valueOf(Long.parseLong("123456789124")));
        put("Джубаилович", BigDecimal.valueOf(1234566891));
        put("Мгеладзе", BigDecimal.valueOf(1234567897));
        put("Пушкин", BigDecimal.valueOf(Long.parseLong("123456788234")));
        put("Толстой", BigDecimal.valueOf(1234567860));
    }};

    @Override
    public String toString() {
        return String.valueOf(map);
    }


    public static boolean isTaxpayerIdNumberValid(BigDecimal taxPayerIdNumber) {
        return taxPayerIdNumber.toString().length() == 10 || taxPayerIdNumber.toString().length() == 12;
    }

    public static boolean checkAccordance(String surname, BigDecimal taxpayerIdNumber) {
        if (map.containsKey(surname)) {
            return map.get(surname).equals(taxpayerIdNumber);
        } else {
            return false;
        }
    }
}