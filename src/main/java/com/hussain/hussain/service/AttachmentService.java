package com.hussain.hussain.service;

import org.springframework.web.multipart.MultipartFile;

import com.hussain.hussain.entity.Attachment;

public interface AttachmentService {
	
	Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;

}
