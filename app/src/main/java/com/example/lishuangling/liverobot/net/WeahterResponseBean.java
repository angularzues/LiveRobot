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


public class WeahterResponseBean {


    /**
     * intent : {"actionName":"","code":10008,"intentName":"","parameters":{"weather":"{\"date\":\"周五 03月10日 (实时：14℃)\",\"maxTemperature\":17,\"maxWind\":1,\"minTemperature\":3,\"temperature\":\"17 ~ 3℃\",\"weather\":\"阴\",\"wind\":\"南风微风\"}","date":"2017-03-10","city":"北京"}}
     * results : [{"resultType":"text","values":{"text":"今天天气冷要加衣，别冻着了。北京今天阴，南风微风，17到3度。"}}]
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
         * code : 10008
         * intentName :
         * parameters : {"weather":"{\"date\":\"周五 03月10日 (实时：14℃)\",\"maxTemperature\":17,\"maxWind\":1,\"minTemperature\":3,\"temperature\":\"17 ~ 3℃\",\"weather\":\"阴\",\"wind\":\"南风微风\"}","date":"2017-03-10","city":"北京"}
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
             * weather : {"date":"周五 03月10日 (实时：14℃)","maxTemperature":17,"maxWind":1,"minTemperature":3,"temperature":"17 ~ 3℃","weather":"阴","wind":"南风微风"}
             * date : 2017-03-10
             * city : 北京
             */

            private String weather;
            private String date;
            private String city;

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }
        }
    }

    public static class ResultsBean {
        /**
         * resultType : text
         * values : {"text":"今天天气冷要加衣，别冻着了。北京今天阴，南风微风，17到3度。"}
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
             * text : 今天天气冷要加衣，别冻着了。北京今天阴，南风微风，17到3度。
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
