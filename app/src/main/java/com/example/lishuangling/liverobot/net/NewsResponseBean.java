package com.example.lishuangling.liverobot.net;

import java.util.List;

/**
 * *   .--,       .--,
 * *  ( (  \.---./  ) )
 * *   '.__/o   o\__.'
 * *      {=  ^  =}
 * *       >  -  <
 * *      /       \
 * *     //       \\
 * *    //|   .   |\\
 * *    "'\       /'"_.-~^`'-.
 * *       \  _  /--'         `
 * *     ___)( )(___
 * *    (((__) (__)))
 * *
 * Created by lishuangling on 2017/3/10.
 */


public class NewsResponseBean {

    /**
     * intent : {"actionName":"","code":10003,"intentName":""}
     * results : [{"resultType":"text","values":{"text":"亲，已帮您找到相关新闻"}},{"resultType":"news","values":{"news":[{"name":"曾荫权服刑不足3周正式上诉 同时申请保释出狱","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/news/transform/20170310/jE53-fychttf8891191.jpg/w160h120l1t1e2e.jpg","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychihc6032129.d.html?vt=4&pos=3"},{"name":"洪秀柱访\u201c八二三\u201d炮战老兵 称两岸应避免战事","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/translate/20170310/-4s--fychhvn8090697.jpg/w160h120l1t1a94.jpg","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychihc6055680.d.html?vt=4&pos=3"},{"name":"院士:攻克雾霾形成机理 李克强：谁攻克 重奖谁","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/www/transform/20170310/XF3H-fychttf8914040.jpg/w160h120l1t1865.jpg","detailurl":"http://news.sina.cn/2017-03-10/detail-ifychhus0385957.d.html?vt=4&pos=3"},{"name":"王文彪委员:生态脆弱区精准扶贫应解决三重问题","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/www/transform/20170310/gChl-fychttf8926251.jpg/w160h120l1t1a10.jpg","detailurl":"http://news.sina.cn/2017-03-10/detail-ifychhus0379422.d.html?vt=4&pos=3"},{"name":"\u201c潘刚之问\u201d如火如荼 主角话锋剑指\u201c沃土\u201d","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/www/transform/20170310/_oFR-fychhus0404728.png/w160h120l1t1c6d.jpg","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychhus0398442.d.html?vt=4&pos=3"},{"name":"王胜明答校园暴力问题:展开调研 着重做3项工作","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/www/transform/20170310/Zxnp-fychhuq3626253.jpg/w160h120l1t1f86.jpg","detailurl":"http://news.sina.cn/2017-03-10/detail-ifychavf2279440.d.html?vt=4&pos=3"},{"name":"中国驻德使馆就辱华T恤发声明:要求下架并道歉","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/news/transform/20170310/IT_R-fychttf8893846.png/w160h120l1t1914.jpg","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychhuq3596138.d.html?vt=4&pos=3"},{"name":"中国游客因萨德退订韩酒店 乐天3成预订遭取消","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/news/transform/20170310/s70w-fychhvn8082811.jpg/w160h120l1t19e3.jpg","detailurl":"http://news.sina.cn/gj/2017-03-10/detail-ifychhus0361053.d.html?vt=4&pos=3"},{"name":"工商总局局长回应乐天被处罚:因涉违法广告问题","info":"新浪新闻","icon":"","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychhuq3742362.d.html?vt=4&pos=3"},{"name":"工商总局:网购7日无理由退货办法将在3.15出台","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/news/transform/20170310/UV_z-fychhus0512044.jpg/w160h120l1t1e6c.jpg","detailurl":"http://news.sina.cn/gn/2017-03-10/detail-ifychhus0512554.d.html?vt=4&pos=3"},{"name":"马来西亚警方：已确认死者金哲就是金正男","info":"新浪新闻","icon":"https://ks.sinaimg.cn/n/news/crawl/20170310/U_zg-fychhuq3724372.jpg/w160h120l1t14c2.jpg","detailurl":"http://news.sina.cn/gj/2017-03-10/detail-ifychhus0498224.d.html?vt=4&pos=3"},{"name":"中国自主研发ARJ21飞机首次在青藏高原试飞成功","info":"新浪新闻","icon":"","detailurl":"http://news.sina.cn/2017-03-10/detail-ifychihc6119237.d.html?vt=4&pos=3"}]}}]
     */

    private IntentBean intent;
    private List<ResultsBean> results;

    public IntentBean getIntent() {
        return intent;
    }

    public void setIntent(IntentBean intent) {
        this.intent = intent;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class IntentBean {
        /**
         * actionName :
         * code : 10003
         * intentName :
         */

        private String actionName;
        private int code;
        private String intentName;

        public String getActionName() {
            return actionName;
        }

        public void setActionName(String actionName) {
            this.actionName = actionName;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getIntentName() {
            return intentName;
        }

        public void setIntentName(String intentName) {
            this.intentName = intentName;
        }
    }

    public static class ResultsBean {
        /**
         * resultType : text
         * values : {"text":"亲，已帮您找到相关新闻"}
         */

        private String resultType;
        private ValuesBean values;

        public String getResultType() {
            return resultType;
        }

        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        public ValuesBean getValues() {
            return values;
        }

        public void setValues(ValuesBean values) {
            this.values = values;
        }

        public static class ValuesBean {
            /**
             * text : 亲，已帮您找到相关新闻
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
