package demo.jc.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.jc.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
