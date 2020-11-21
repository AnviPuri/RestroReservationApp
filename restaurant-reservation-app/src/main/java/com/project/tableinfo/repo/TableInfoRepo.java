package com.project.tableinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.tableinfo.entity.TableInfo;

public interface TableInfoRepo extends JpaRepository<TableInfo, Integer> {

}
