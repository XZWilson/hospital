package com.g1.hospital.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSBuilder;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.CannedAccessControlList;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class OssFileUpload {
    private final static String endPoint = "oss-cn-hangzhou.aliyuncs.com";
    private final static String accessKey = "LTAI5tRHxcr4p5VBx185FvtB";
    private final static String keySecret = "lDGK8WsorGZjgFnqHiB1VWL2mLN1xD";
    private final static String bucketName = "k3501-sugarmelon";

    public static String upload_File(String filename, InputStream inputStream){
        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKey, keySecret);
        //2.使用OSSClient对象的方法操作对象
        //设置oss实例的访问权限：公共读
        ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
        //ossClient.putObject("桶名","文件名称",文件对象);
        //获取源文件的输入流
        ossClient.putObject(bucketName,filename,inputStream);
        //3.关闭
        ossClient.shutdown();
        //4.获取图片的路径
        String path="http://" + bucketName + "." + endPoint + "/" + filename;
        return path;
    }
}
