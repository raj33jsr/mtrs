/**
 * 
 */
package com.mrts.saleservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mrts.saleservice.domain.Sale;

/**
 * @author bharamil
 *
 */
public interface SaleServiceRepository extends MongoRepository<Sale, String>, SaleServiceCustomRepository {

}
