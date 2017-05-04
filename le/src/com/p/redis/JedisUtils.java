package com.p.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by p on 2017/5/4.
 */
public class JedisUtils {
    private static String addr = "localhost";

    private static int port = 6379;

    //private static String passwd = "root";

    //可用连接实例的最大数目，默认为8
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此
    //时pool的状态为exhausted(耗尽)。
    private static int MAX_ACTIVE = 1024;

    //控制一个pool最多有多少个状态为idle(空闲)的jedis实例，默认也是8
    private static int MAX_IDLE = 200;

    //等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。
    //如果超过等待时间，则直接抛出JedisConnectionException
    private static int MAX_WAIT = 10000;

    private static int TIMEOUT = 10000;

    //在borrow一个redis实例时，是否提前进行validate操作；
    //如果为true，则得到的jedis实例均是可用的
    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

     /**
     * 初始化Redis连接池
     * Jedis的连接池配置需要用到org.apache.commons.pool.impl.GenericObjectPool.Config.class
     * 所以要引入commons-pool.jar
     * */
    static{
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            //config.setMaxTotal(MAX_ACTIVE);//老版本是setMaxActive
            //config.setMaxIdle(MAX_IDLE);
            //config.setMaxWaitMillis(MAX_WAIT);//老版本是maxMaxWait
            //config.setTestOnBorrow(TEST_ON_BORROW);
            //jedisPool = new JedisPool(config,addr,port,TIMEOUT);//有密码的时候传入AUTH

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Jedis实例
     * */
    public synchronized static Jedis getJedis(){
        try {
            if(jedisPool != null){
                Jedis resource = jedisPool.getResource();
                return resource;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 释放jedis资源
     * */
    public static void returnResource(final Jedis jedis){
        if(jedis != null){
            jedisPool.returnResourceObject(jedis);
        }
    }
}

