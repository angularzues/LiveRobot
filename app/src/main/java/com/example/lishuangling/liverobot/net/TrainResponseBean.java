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


public class TrainResponseBean {

    /**
     * intent : {"actionName":"","code":10018,"intentName":""}
     * results : [{"resultType":"url","values":{"url":"http://touch.qunar.com/h5/train/trainList?startStation=%E5%8C%97%E4%BA%AC&endStation=%E4%B8%8A%E6%B5%B7&searchType=stasta&date=2017-03-11&sort=3&filterTrainType=1&filterTrainType=2&filterTrainType=3&filterTrainType=4&filterTrainType=5&filterTrainType=6&filterTrainType=7&filterDeptTimeRange=1&filterDeptTimeRange=2&filterDeptTimeRange=3&filterDeptTimeRange=4"}},{"resultType":"text","values":{"text":"亲，已帮你找到列车信息"}}]
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
         * code : 10018
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
         * values : {"url":"http://touch.qunar.com/h5/train/trainList?startStation=%E5%8C%97%E4%BA%AC&endStation=%E4%B8%8A%E6%B5%B7&searchType=stasta&date=2017-03-11&sort=3&filterTrainType=1&filterTrainType=2&filterTrainType=3&filterTrainType=4&filterTrainType=5&filterTrainType=6&filterTrainType=7&filterDeptTimeRange=1&filterDeptTimeRange=2&filterDeptTimeRange=3&filterDeptTimeRange=4"}
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
             * url : http://touch.qunar.com/h5/train/trainList?startStation=%E5%8C%97%E4%BA%AC&endStation=%E4%B8%8A%E6%B5%B7&searchType=stasta&date=2017-03-11&sort=3&filterTrainType=1&filterTrainType=2&filterTrainType=3&filterTrainType=4&filterTrainType=5&filterTrainType=6&filterTrainType=7&filterDeptTimeRange=1&filterDeptTimeRange=2&filterDeptTimeRange=3&filterDeptTimeRange=4
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
