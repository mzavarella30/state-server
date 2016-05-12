(defproject state-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [expectations "2.1.8"]
                 [cheshire "5.5.0"]
                 [ring "1.4.0"]]
  :main state-server.server
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
