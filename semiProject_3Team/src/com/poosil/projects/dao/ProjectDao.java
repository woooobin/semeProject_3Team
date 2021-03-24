package com.poosil.projects.dao;

import java.util.List;
import java.util.Map;

import com.poosil.projects.dto.HashtagDto;
import com.poosil.projects.dto.ProjectDto;
import com.poosil.projects.dto.ProjectItemDto;

public interface ProjectDao {
	public List<ProjectDto> selectList();
	public Map<String, Integer> insertProject(
			String userId, 
			String projectMainTitle,
			String projectSubTitle, 
			String thumbImage, 
			String goalPrice, 
			String projectCategory,
			String projectStartDate,
			String projectEndDate,
			String shippingStartDate,
			String detailDesc
		);
	public int insertProjectItems(List<ProjectItemDto> list);
	public ProjectDto selectOne(int projectId);
	
	public List<String> selectExistHashtags (List<String> hashtags);
	public int insertHashtags (List<HashtagDto> hashtags);
	
	public int insertProjectHashtags (List<String> hashtagList, int projectId) ;

}
