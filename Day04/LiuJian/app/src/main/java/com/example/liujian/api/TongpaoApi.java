package com.example.liujian.api;


import com.example.liujian.bean.BannerBean;
import com.example.liujian.bean.DiscoverTabBean;
import com.example.liujian.bean.DiscoverTabRvBean;
import com.example.liujian.bean.DiscoverTopicBean;
import com.example.liujian.bean.RecommendBean;
import com.example.liujian.bean.RecommendUserBean;
import com.example.liujian.bean.TopicBean;
import com.example.liujian.bean.UserInfoData;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 */
public interface TongpaoApi {
    String BASE_URL="http://cdwan.cn:7000/tongpao/";

    @GET("home/recommend.json")
    Flowable<RecommendBean> getRecommend();

    @GET("home/banner.json")
    Flowable<BannerBean> getBanner();

    @GET("home/hot_user.json")
    Flowable<RecommendUserBean> getRecommendUser();

    @GET("home/topic_discussed.json")
    Flowable<TopicBean> getTopic();


    @GET("home/personal.json")
    Flowable<UserInfoData> getUserInfo();

    @GET("discover/hot_activity.json")
    Flowable<DiscoverTopicBean> getDiscoverTopic();

    @GET("discover/navigation.json")
    Flowable<DiscoverTabBean> getDiscoverTab();

    @GET("discover/news_{type}.json")
    Flowable<DiscoverTabRvBean> getDiscoverTabRv(@Path("type") int type);

}
