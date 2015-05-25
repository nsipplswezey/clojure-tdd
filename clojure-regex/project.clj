(defproject clojure-regex "0.1.0-SNAPSHOT"
  :description "Building Tests for regex1 Examples In Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [expectations "2.0.9"]]
  :plugins [[lein-autoexpect "1.4.0"]]
  :main ^:skip-aot clojure-regex.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
