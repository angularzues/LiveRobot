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


public class MovieResponseBean {
    /**
     * intent : {"actionName":"","code":10025,"intentName":""}
     * results : [{"resultType":"url","values":{"url":"http://m.wangpiao.com/WpTouch/touch/index"}},{"resultType":"text","values":{"text":"亲，已帮您找到电影"}}]
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
         * code : 10025
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
         * resultType : url
         * values : {"url":"http://m.wangpiao.com/WpTouch/touch/index"}
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
             * url : http://m.wangpiao.com/WpTouch/touch/index
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
