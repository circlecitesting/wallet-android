package com.learningmachine.android.app.data.webservice;

import com.learningmachine.android.app.data.webservice.request.IssuerIntroductionRequest;
import com.learningmachine.android.app.data.webservice.response.IssuerResponse;

import java.net.URI;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

public interface IssuerService {

    @GET
    Observable<IssuerResponse> getIssuer(@Url String url);

    @GET
    Observable<IssuerResponse> getIssuer(@Url URI url);

    @POST
    Observable<Void> postIntroduction(@Url String url, @Body IssuerIntroductionRequest request);
}
