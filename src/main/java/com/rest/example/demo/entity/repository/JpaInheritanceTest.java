package com.rest.example.demo.entity.repository;

import com.rest.example.demo.entity.Resources;
import com.rest.example.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

interface JpaInheritanceTest extends JpaRepository<Resources, Integer> {
}
