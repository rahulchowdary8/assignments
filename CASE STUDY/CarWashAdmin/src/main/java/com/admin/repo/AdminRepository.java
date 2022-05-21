package com.admin.repo;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.models.WashPacks;

public interface AdminRepository extends MongoRepository<WashPacks, Integer>{

	void save(Admin admin);

}
