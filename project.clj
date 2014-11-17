(defproject xyzzwhy-bot "0.1.0-SNAPSHOT"
  :description "A Twitter bot who takes you on surreal adventures."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [environ "1.0.0"]
                 [com.novemberain/monger "2.0.0"]
                 [twitter-api "0.7.7"]]
  :main ^:skip-aot xyzzwhy-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
