package com.PracticeBlog.PracticeBlog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PracticeBlog.PracticeBlog.Entity.PracticeApp;

public interface PracticeRepository extends JpaRepository<PracticeApp, Long> {

}
