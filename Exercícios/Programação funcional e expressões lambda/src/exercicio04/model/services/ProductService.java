package exercicio04.model.services;

import java.util.List;
import java.util.function.Predicate;
import exercicio04.model.entities.Product;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}