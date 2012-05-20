(defproject i-am-a-horse-in-the-land-of-booleans "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev
             {:dependencies
              [[midje "1.4.0"]
               [com.stuartsierra/lazytest "1.2.3"]]}}
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]])
