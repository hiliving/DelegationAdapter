package com.kevin.delegationadapter.sample.pro.meishijie.bean;

import java.util.List;

/**
 * Meishi
 *
 * @author zwenkai@foxmail.com, Created on 2018-06-13 11:02:21
 *         Major Function：<b></b>
 *         <p/>
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * @author mender，Modified Date Modify Content:
 */

public class Meishi {
    public List<Channel> channel;
    public Sancan sancan;
    public Zhuanti zhuanti;

    public class Channel {
        public String img;
        public String title;
    }

    public static class Sancan {
        public String title;
        public int select;
        public List<SancanItem> items;
    }

    public static class SancanItem {
        public String title;
        public String type;
        public List<SancanSubItem> items;
    }

    public static class SancanSubItem {
        public String img;
        public String id;
        public String title;
    }

    public static class Zhuanti {
        public String title;
        public List<ZhuantiItem> items;
    }

    public static class ZhuantiItem {
        public String img;
        public String title;
    }

}
