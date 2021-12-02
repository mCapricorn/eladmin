package me.zhengjie.base;

import me.zhengjie.mongo.MongoBaseDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends MongoRepository<T, ID> {

}
