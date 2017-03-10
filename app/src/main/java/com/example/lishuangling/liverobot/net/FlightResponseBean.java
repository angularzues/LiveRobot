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


public class FlightResponseBean {

    /**
     * intent : {"actionName":"","code":10017,"intentName":"","parameters":{"end_city":"上海","start_city":"北京","depart_date":"2017-03-11"}}
     * results : [{"resultType":"url","values":{"url":"http://touch.qunar.com/h5/flight/flightlist?bd_source=chongdong&startCity=%E5%8C%97%E4%BA%AC&destCity=%E4%B8%8A%E6%B5%B7&startDate=2017-03-11&backDate=&flightType=oneWay&priceSortType=1"}},{"resultType":"text","values":{"text":"亲，已帮你找到航班信息"}}]
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
         * code : 10017
         * intentName :
         * parameters : {"end_city":"上海","start_city":"北京","depart_date":"2017-03-11"}
         */

        private String actionName;
        private int code;
        private String intentName;
        private ParametersBean parameters;

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

        public ParametersBean getParameters() {
            return parameters;
        }

        public void setParameters(ParametersBean parameters) {
            this.parameters = parameters;
        }

        public static class ParametersBean {
            /**
             * end_city : 上海
             * start_city : 北京
             * depart_date : 2017-03-11
             */

            private String end_city;
            private String start_city;
            private String depart_date;

            public String getEnd_city() {
                return end_city;
            }

            public void setEnd_city(String end_city) {
                this.end_city = end_city;
            }

            public String getStart_city() {
                return start_city;
            }

            public void setStart_city(String start_city) {
                this.start_city = start_city;
            }

            public String getDepart_date() {
                return depart_date;
            }

            public void setDepart_date(String depart_date) {
                this.depart_date = depart_date;
            }
        }
    }

    public static class ResultsBean {
        /**
         * resultType : url
         * values : {"url":"http://touch.qunar.com/h5/flight/flightlist?bd_source=chongdong&startCity=%E5%8C%97%E4%BA%AC&destCity=%E4%B8%8A%E6%B5%B7&startDate=2017-03-11&backDate=&flightType=oneWay&priceSortType=1"}
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
             * url : http://touch.qunar.com/h5/flight/flightlist?bd_source=chongdong&startCity=%E5%8C%97%E4%BA%AC&destCity=%E4%B8%8A%E6%B5%B7&startDate=2017-03-11&backDate=&flightType=oneWay&priceSortType=1
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
