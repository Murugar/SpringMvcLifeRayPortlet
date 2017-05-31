package com.iqmsoft.boot.liferay.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.boot.liferay.model.Record;


@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface RecordsDAO extends CrudRepository<Record, Long> {

}
