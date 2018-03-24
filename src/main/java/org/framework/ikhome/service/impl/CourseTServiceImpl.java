package org.framework.ikhome.service.impl;

import org.framework.ikhome.entity.CourseTreply;
import org.framework.ikhome.mapper.CourseTMapper;
import org.framework.ikhome.service.CourseTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 课程家教老师评价回复服务层实现类
 * @author chengxi
 */
@Component
public class CourseTServiceImpl implements CourseTService {

    @Autowired
    private CourseTMapper courseTMapper;

    /**
     * 获取指定课程的对应用户评价的老师回复
     * @param cid
     * @param cmid
     * @return
     */
    @Override
    public CourseTreply getCourseTreply(Integer cid, Integer cmid) {

        return courseTMapper.getCourseTreply(cid, cmid);
    }
}
