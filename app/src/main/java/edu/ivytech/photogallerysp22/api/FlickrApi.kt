package edu.ivytech.photogallerysp22.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=8e683ea8fddffd8dee317452f15ff2db" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    fun fetchPhotos() : Call<FlickrResponse>
}