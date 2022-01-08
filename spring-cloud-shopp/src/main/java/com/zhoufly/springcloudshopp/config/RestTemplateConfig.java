package com.zhoufly.springcloudshopp.config;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author adanmint@163.com
 * @Date 2022-01-08 1:05 PM
 */
/*
@Configuration
*/
public class RestTemplateConfig {

/*    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(getClientHttpRequestFactory());
    }

    *//**
     * 配置HttpClient超时时间
     *
     * @return
     *//*
    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(HTTP_SOCKET_TIMEOUT)
                .setConnectTimeout(HTTP_CONNECT_TIMEOUT).build();
        CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        return new HttpComponentsClientHttpRequestFactory(client);
    }

    *//** http请求socket连接超时时间,毫秒为单位 *//*
    public static final int HTTP_SOCKET_TIMEOUT = 15000;

    *//** http请求连接超时时间,毫秒为单位 *//*
    public static final int HTTP_CONNECT_TIMEOUT = 15000;*/

}
