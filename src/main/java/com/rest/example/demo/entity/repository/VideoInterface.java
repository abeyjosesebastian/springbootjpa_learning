package com.rest.example.demo.entity.repository;

import com.rest.example.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoInterface extends JpaRepository<Video,Integer> {
}
