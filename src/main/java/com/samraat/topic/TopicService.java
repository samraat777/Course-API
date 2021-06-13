package com.samraat.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService { 
	
@Autowired 	 
private TopicRepository topicRepository;



//private List<Topic> topics = new ArrayList<>(Arrays.asList(
//		new Topic("spring","Spring Boot","Learning Rest Api via Spring Boot"),
//		new Topic("Java","Spring Boot","Learning Rest Api via Spring Boot"),
//		new Topic("C++","Spring Boot","Learning Rest Api via Spring Boot"),
//		new Topic("JavaScript","Spring Boot","Learning Rest Api via Spring Boot"),
//		new Topic("HTML","Spring Boot","Learning Rest Api via Spring Boot")
//		));

public List<Topic> getAllTopic(){
	//return topics;
	List<Topic> topics = new ArrayList<Topic>(); 
	 topicRepository.findAll().forEach(topics::add);
	 return topics;
}

public Topic getTopic(String id)
{
	//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	return topicRepository.findById(id).orElse(null);
}

public void addTopic(Topic topic) {
	topicRepository.save(topic);
}

public void updateTopic(String id, Topic topic) {
	
//	for(int i = 0;i<topics.size();i++)
//	{
//		Topic t = topics.get(i);
//		if(t.getId().equals(id))
//		{
//			topics.set(i, topic);
//			return;
//		}
//	}
	topicRepository.save(topic);
}

public void deleteTopic(String id) {
	//topics.removeIf(t->t.getId().equals(id));
	topicRepository.deleteById(id);
} 
}
