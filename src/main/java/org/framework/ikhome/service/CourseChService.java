package org.framework.ikhome.service;

import org.framework.ikhome.entity.CourseChapter;

import java.util.List;

public interface CourseChService {

    /**
     * 获取指定课程的章节目录数据
     * @param cid
     * @return
     */
    List<CourseChapter> getCourseChapter(Integer cid);
}
