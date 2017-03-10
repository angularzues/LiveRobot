package com.example.lishuangling.liverobot.net;

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
 * Created by lishuangling on 2017/3/9.
 */


public class TulingRequestBean {

    /**
     * perception : {"inputText":{"text":"附近的酒店"},"selfInfo":{"location":{"city":"北京","latitude":"39.45492","longitude":"119.239293","nearest_poi_name":"上地环岛南","province":"北京","street":"信息路"}}}
     * userInfo : {"apiKey":"","userId":""}
     */

    private PerceptionBean perception;
    private UserInfoBean userInfo;

    public PerceptionBean getPerception() {
        return perception;
    }

    public void setPerception(PerceptionBean perception) {
        this.perception = perception;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public static class PerceptionBean {
        /**
         * inputText : {"text":"附近的酒店"}
         * selfInfo : {"location":{"city":"北京","latitude":"39.45492","longitude":"119.239293","nearest_poi_name":"上地环岛南","province":"北京","street":"信息路"}}
         */

        private InputTextBean inputText;
        private SelfInfoBean selfInfo;

        public InputTextBean getInputText() {
            return inputText;
        }

        public void setInputText(InputTextBean inputText) {
            this.inputText = inputText;
        }

        public SelfInfoBean getSelfInfo() {
            return selfInfo;
        }

        public void setSelfInfo(SelfInfoBean selfInfo) {
            this.selfInfo = selfInfo;
        }

        public static class InputTextBean {
            /**
             * text : 附近的酒店
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class SelfInfoBean {
            /**
             * location : {"city":"北京","latitude":"39.45492","longitude":"119.239293","nearest_poi_name":"上地环岛南","province":"北京","street":"信息路"}
             */

            private LocationBean location;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class LocationBean {
                /**
                 * city : 北京
                 * latitude : 39.45492
                 * longitude : 119.239293
                 * nearest_poi_name : 上地环岛南
                 * province : 北京
                 * street : 信息路
                 */

                private String city;
                private String latitude;
                private String longitude;
                private String nearest_poi_name;
                private String province;
                private String street;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getNearest_poi_name() {
                    return nearest_poi_name;
                }

                public void setNearest_poi_name(String nearest_poi_name) {
                    this.nearest_poi_name = nearest_poi_name;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }
            }
        }
    }

    public static class UserInfoBean {
        /**
         * apiKey :
         * userId :
         */

        private String apiKey;
        private int userId;

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
