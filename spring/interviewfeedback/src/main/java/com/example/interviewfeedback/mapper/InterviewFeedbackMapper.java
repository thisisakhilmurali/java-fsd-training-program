package com.example.interviewfeedback.mapper;

import com.example.interviewfeedback.dto.InterviewFeedbackDTO;
import com.example.interviewfeedback.entity.InterviewFeedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface InterviewFeedbackMapper extends GenericMapper<InterviewFeedback, InterviewFeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    InterviewFeedback asEntity(InterviewFeedbackDTO dto);
}