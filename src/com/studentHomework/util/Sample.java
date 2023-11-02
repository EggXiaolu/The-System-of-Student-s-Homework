// This file is auto-generated, don't edit it. Thanks.
package com.studentHomework.util;

import java.util.Random;

public class Sample {

    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    /**
    * 使用STS鉴权方式初始化账号Client，推荐此方式。本示例默认使用AK&SK方式。
    * @param accessKeyId
    * @param accessKeySecret
    * @param securityToken
    * @return Client
    * @throws Exception
    */
    public static com.aliyun.dysmsapi20170525.Client createClientWithSTS(String accessKeyId, String accessKeySecret, String securityToken) throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret)
                // 必填，您的 Security Token
                .setSecurityToken(securityToken)
                // 必填，表明使用 STS 方式
                .setType("sts");
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    public static String main(String phone) throws Exception {
        //java.util.List<String> args = java.util.Arrays.asList(args_);
        Random random = new Random();
        String code = String.valueOf(random.nextInt(89999)+10000);
        System.out.println(code);
        // 工程代码泄露可能会导致AccessKey泄露，并威胁账号下所有资源的安全性。以下代码示例仅供参考，建议使用更安全的 STS 方式，更多鉴权访问方式请参见：https://help.aliyun.com/document_detail/378657.html
        com.aliyun.dysmsapi20170525.Client client = Sample.createClient("", "");
        com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
                .setSignName("阿里云短信测试")
                .setTemplateCode("SMS_154950909")
                .setPhoneNumbers(phone)
                .setTemplateParam("{\"code\":\""+code+"\"}");
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        com.aliyun.dysmsapi20170525.models.SendSmsResponse resp = client.sendSmsWithOptions(sendSmsRequest, runtime);
        com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(resp));
        return code;
    }
}
