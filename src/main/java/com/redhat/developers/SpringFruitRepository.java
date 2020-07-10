package com.redhat.developers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringFruitRepository extends JpaRepository<Fruit, Long> {

    public List<Fruit> findBySeason(String season);

}
