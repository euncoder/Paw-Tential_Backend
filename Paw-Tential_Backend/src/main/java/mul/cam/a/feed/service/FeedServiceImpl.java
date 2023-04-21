package mul.cam.a.feed.service;

import mul.cam.a.feed.dao.FeedDao;
import mul.cam.a.feed.dto.FeedDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements FeedService{

  @Autowired
  FeedDao dao;
  @Override
  public List<FeedDto> feed() {
    return dao.mainFeed();
  }
}