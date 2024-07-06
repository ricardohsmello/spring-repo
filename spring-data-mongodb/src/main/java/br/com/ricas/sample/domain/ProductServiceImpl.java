package br.com.ricas.sample.domain;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;

public class ProductServiceImpl {


    MongoTemplate mongoTemplate;

    public ProductServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public Product getProduct(String id) {
        AggregationResults<Product> aggregate = mongoTemplate.aggregate(Aggregation.newAggregation(
                Aggregation.match(new Criteria().and("id").is(id))
        ), "products", Product.class);

        return aggregate.getMappedResults().getFirst();
    }


}
