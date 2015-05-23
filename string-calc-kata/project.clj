(defproject string-calc-kata "0.1.0-SNAPSHOT"
  :description "String Calculator Kata"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [expectations "2.0.9"]]
  :plugins [[lein-autoexpect "1.4.0"]]
  :main ^:skip-aot string-calc-kata.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
