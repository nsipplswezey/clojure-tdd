(ns string-calc-kata.core-test
  (:require ;;[clojure.test :refer :all]
   ;;instead of using clojure test, we use expectations
            [expectations :refer :all]
            [string-calc-kata.core :refer :all]))

;;this is the syntax for clojure test
;;(deftest a-test
;;  (testing "FIXME, I fail."
;;    (is (= 0 1))))


;;and this is the syntax for expecations
(expect true (= 1 1))

;;the simplest case of our string calculator
;;an empty string should return 0
(expect 0 (sum-a-string ""))

;;A single digit should return itself
(expect 1 (sum-a-string "1"))

