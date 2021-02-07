package com.sprinrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinrest.springrest.dao.Coursedao;
import com.sprinrest.springrest.entities.Course;
@Service
public class CourseServiceimpl implements CourseService {
	@Autowired
	private Coursedao coursedao;
//List<Course> list;
	
	
	public CourseServiceimpl() {
	//	list = new ArrayList<>();
		//list.add(new Course(145,"Java Core Course","This core contains core of java"));
		//list.add(new Course(100,"CSS","Course of CSS"));
	}
	@Override
	public List<Course> getCourses() {
		
		return coursedao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		return coursedao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
//			list.add(course);
		coursedao.save(course);
			return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e-> {
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDesc(course.getDesc());
//			}
//		});
		coursedao.save(course);
		return course;
		}
	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

}
