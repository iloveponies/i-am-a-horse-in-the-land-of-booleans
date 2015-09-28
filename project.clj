(defproject i-am-a-horse-in-the-land-of-booleans "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/i-am-a-horse-in-the-land-of-booleans "0.1.0-SNAPSHOT"]
                 [lein-light-nrepl "0.1.3"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}}
  :repl-options {:nrepl-middleware [lighttable.nrepl.handler/lighttable-ops]})
