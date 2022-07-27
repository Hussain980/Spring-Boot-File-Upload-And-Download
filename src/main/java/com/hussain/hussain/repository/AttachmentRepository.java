package com.hussain.hussain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hussain.hussain.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, String> {

}
