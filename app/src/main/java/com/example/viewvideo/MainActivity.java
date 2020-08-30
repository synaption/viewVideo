package com.example.viewvideo;

import android.os.Bundle;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView mVideosListView;
    private List<Video> mVideosList = new ArrayList<>();
    private VideoAdapter mVideoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign video
        mVideosListView = (ListView) findViewById(R.id.videoListView);

        //create videos
        Video riverVideo = new Video("https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8"); //testing
        //Video riverVideo = new Video("rtmp://192.168.1.3/webcam/mystream");
        //Video riverVideo = new Video("rtsp://192.168.1.10:8554/");
        //Video riverVideo = new Video("http://192.168.1.6/hls/index.m3u8"); //working
        //Video riverVideo = new Video("http://71.57.126.1/hls/index.m3u8");
        //Video riverVideo = new Video("udp://192.168.1.6:5000");


        mVideosList.add(riverVideo);


        /***populate video list to adapter**/
        mVideoAdapter = new VideoAdapter(this, mVideosList);
        mVideosListView.setAdapter(mVideoAdapter);



    }
}