package com.walkingwithdev.liveat500px.manager.http;

import com.walkingwithdev.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Nick on 6/1/2016 AD.
 */
public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
