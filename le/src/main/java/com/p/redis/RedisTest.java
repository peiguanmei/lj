package com.p.redis;

import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * Created by p on 2017/5/4.
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        //System.out.println("connection to server successfully");

        //System.out.println("Server is running :" + jedis.ping());

        //jedis.set("p", "p2");
        //System.out.println("the value of p is :"+ jedis.get("p"));
        //jedis.set("p", "p3");
        //System.out.println("the value of p is :"+ jedis.get("p"));

        //jedis.lpush("jedisList", "username", "password");
        //System.out.println(jedis.lrange("jedisList", 0, 100));
        //List list = jedis.lrange("jedisList", 0, 100);
        //System.out.println(list);
        //List list1 =  Arrays.asList("username", "password");

        //Map<String, String> map = new HashMap<String, String>();
        //map.put("username","p");
        //map.put("password", "123");
        //jedis.hmset("jedisHash",map);
        //System.out.println(jedis.hget("jedisHash","username"));
        //System.out.println(jedis.hgetAll("jedisHash"));

        //jedis.sadd("jedisSet", "username", "password");
        //System.out.println(jedis.smembers("jedisSet"));

        //jedis.zadd("jedisZset", 1, "username");
        //jedis.zadd("jedisZset", 2, "password");
        //System.out.println(jedis.zrangeByScore("jedisZset", 0, 100));
    }
}
