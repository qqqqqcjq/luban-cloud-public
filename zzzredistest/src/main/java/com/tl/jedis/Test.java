package com.tl.jedis;/*
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 图灵学院-悟空老师
 * www.jiagouedu.com
 * 悟空老师QQ：245553999
 */

import redis.clients.jedis.Jedis;


public class Test {

    public static void main(String[] args) {
        //new client host ip 没有进行服务端连接, 只是进行了赋值
        Jedis jedis = new Jedis("192.168.43.122", 7001);
        jedis.auth("zilu");
        //真正连接 $*&
        System.out.println(jedis.set("wk", "sky"));;
        System.out.println(jedis.get("wk"));
        jedis.close();


//        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
//        //Jedis Cluster will attempt to discover cluster nodes automatically
//        jedisClusterNodes.add(new HostAndPort("192.168.43.122", 7001));
//        JedisCluster jc = new JedisCluster(jedisClusterNodes);
//        jc.set("foo", "bar");
//        String value = jc.get("foo");
//        System.out.println(value);

    }
}
