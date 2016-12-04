(defproject dynamodb-expressions (or (System/getenv "PROJECT_VERSION") "0.0.0-SNAPSHOT")
  :description "Better DynamoDB expressions with Clojure"
  :url "http://github.com/brabster/dynamodb-expressions"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["snapshots" {:url "https://clojars.org/repo"
                               :username :env/clojars_username
                               :password :env/clojars_password}]
                 ["releases" {:url "https://clojars.org/repo"
                              :username :env/clojars_username
                              :password :env/clojars_password
                              :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[instaparse "1.4.3"]
                                  [docker-fixture "0.1.1"]
                                  [amazonica "0.3.78" :exclusions [com.amazonaws/aws-java-sdk
                                                                   com.amazonaws/amazon-kinesis-client]]
                                  [com.amazonaws/aws-java-sdk-core "1.11.63"]
                                  [com.amazonaws/aws-java-sdk-dynamodb "1.11.63"]]}})
