package com.samraat.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
//getAllTopic()
//getTopic
//updateTopic
//deleteTopic
	
public List<Course> findByTopicId(String topicId);
	
	 
}
