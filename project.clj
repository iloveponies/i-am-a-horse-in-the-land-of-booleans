(defproject i-am-a-horse-in-the-land-of-booleans "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/i-am-a-horse-in-the-land-of-booleans "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}}
  :plugins [[lein-midje "3.2-RC4"] [lein-kibit "0.1.2"]])
