package product.api.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.api.product.model.TechnicalDetail;

import java.util.List;

@Repository
public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail, Long> {

    List<TechnicalDetail> findByProductId(long id);
}



