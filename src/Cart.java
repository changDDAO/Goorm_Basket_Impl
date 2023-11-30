import java.util.*;

public class Cart {
    private Map<Product, Integer> productMap = new HashMap<>();
    //기본 생성자
    public Cart() {
    }
    public void showItems() {
        Set<Map.Entry<Product, Integer>> productsInCart = productMap.entrySet();
        for (Map.Entry<Product, Integer> productIntegerEntry : productsInCart) {
            System.out.print("상품 이름 : " + productIntegerEntry.getKey().getProductName()+", ");
            System.out.println("상품 잔여 수량" + productIntegerEntry.getValue());
        }
    }
    public void addProduct(Product product, int quantity) {
        productMap.put(product, productMap.getOrDefault(product, 0) + quantity);
    }
    public void removeProduct(Product product, int quantity) {
        Integer curQuantity = productMap.get(product);
        if (curQuantity - quantity<0) {
            System.out.println("현재 수량보다 많은 수량 제거 요청을 하였습니다.");
            return;
        }
        productMap.put(product, productMap.get(product) - quantity);
    }
}
