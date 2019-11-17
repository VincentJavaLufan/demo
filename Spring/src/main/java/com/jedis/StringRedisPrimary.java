package com.jedis;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * jedis是线程不安全的，需要和线程池一块使用。
 * @author Administrator
 *
 */
public class StringRedisPrimary {

	public static void main(String[] args) {
		String host = "192.168.108.128";
		int port = 6379;
//		Jedis jedis = new Jedis(host, port);
		Jedis jedis = null;
		JedisPool pool = null;
		try {
			pool = RedisUtils.open(host, port);
			jedis = pool.getResource();
			
			jedis.auth("111111");
			jedis.set("name","lufan");
			jedis.set("早餐","豆浆");
			
			String value = jedis.get("k1");
			System.out.println(value);
			
			jedis.mset("lunch", "红烧肉","dinner","小面");
			List<String> values = jedis.mget("早餐", "lunch", "dinner");
			for(String val:values) {
				System.out.println(val);
			}
			
			if(jedis.exists("student-1")) {
				String stu = jedis.get("student-1");
				System.out.println("存在");
			} else {
				jedis.set("student-1","{student}");
			}
		} finally {
			// 把使用完毕的jedis放回pool中，让其他客户端使用
			if(jedis != null) {
				jedis.close();
			}
			RedisUtils.close();
		}
	}
}
