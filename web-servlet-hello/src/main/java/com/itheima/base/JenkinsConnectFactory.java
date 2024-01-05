package com.itheima.base;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import com.offbytwo.jenkins.model.JobWithDetails;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class JenkinsConnectFactory {
    static final String JENKINS_URL = "http://10.10.208.121";
    static final String JENKINS_USERNAME = "root";
    static final String JENKINS_PASSWORD = "super@man";
    private static JenkinsHttpClient jenkinsHttpClient = null;
    private static JenkinsServer jenkinsServer = null;

    public static JenkinsHttpClient getClientInstance() {
        if (jenkinsHttpClient == null) {
            try {
                jenkinsHttpClient = new JenkinsHttpClient(new URI(JENKINS_URL, JENKINS_USERNAME, JENKINS_PASSWORD), "PengHuanZhi", "11622ce96b51846c8658a6390253d87f7e");
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return jenkinsHttpClient;
    }

    public static JenkinsServer getConnection() {
        if (jenkinsServer == null) {
            try {
                jenkinsServer = new JenkinsServer(new URI(JENKINS_URL, JENKINS_USERNAME, JENKINS_PASSWORD), "PengHuanZhi", "11622ce96b51846c8658a6390253d87f7e");
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return jenkinsServer;
    }


    public void getJob() {
        System.out.println("##");
        JenkinsServer server = JenkinsConnectFactory.getConnection();
        System.out.println(server.getVersion());
//        try {
//            // 获取 Job 信息
//            JobWithDetails job = JenkinsConnectFactory.getConnection().getJob("Pipeline");//          // 获取 Job 名称
//            System.out.println(job);
//            // 获取 Job URL
//            System.out.println(job.getUrl());
//            // 获取 Job 下一个 build 编号
//            System.out.println(job.getNextBuildNumber());
//            // 获取 Job 显示的名称
//            System.out.println(job.getDisplayName());
//            // 输出 Job 描述信息
//            System.out.println(job.getDescription());
//            // 获取 Job 下游任务列表
//            System.out.println(job.getDownstreamProjects());
//            // 获取 Job 上游任务列表
//            System.out.println(job.getUpstreamProjects());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        JenkinsConnectFactory obj = new JenkinsConnectFactory();
        obj.getJob();
    }

}

