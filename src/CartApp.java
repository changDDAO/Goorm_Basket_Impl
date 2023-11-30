import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();
        // TODO : 상품 클래스를 생성하여 상품목록에 넣는다.
        Product 김치 = new Product(1L, "김치", 10000);
        Product 배추 = new Product(2L, "배추", 7000);
        Product 삼겹살 = new Product(3L, "삼겹살", 20000);
        Product 마늘 = new Product(4L, "마늘", 3000);
        Product 깻잎 = new Product(5L, "깻잎", 1000);
        // 상품의 이름을 비교하여 고유값으로 여기게 하기 위해  equals()와 hashCode()를 override
        Product 깻잎2 = new Product(5L, "깻잎", 1000);
        productSet.add(김치);
        productSet.add(배추);
        productSet.add(삼겹살);
        productSet.add(마늘);
        productSet.add(깻잎);
        productSet.add(깻잎2);
        System.out.println("고유한 상품 목록");
        for (Product product : productSet) {
            System.out.println("product.getProductName() = " + product.getProductName());
            System.out.println("product.getProductName() = " + product.getPrice());
        }

        Cart myCart = new Cart();
        myCart.addProduct(김치,3);
        myCart.addProduct(배추,7);
        myCart.addProduct(삼겹살,6);
        myCart.addProduct(마늘,1);
        myCart.removeProduct(삼겹살, 2);
        myCart.showItems();
        //재미있는 과제군요 허허.
    }
}