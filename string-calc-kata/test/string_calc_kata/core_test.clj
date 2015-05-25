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

;;Two digits separated by comma should return the sum of the digits
(expect 2 (sum-a-string "1,1"))

;;Allow the add method to take an unknown number of comma sperated arguments
(expect 10 (sum-a-string "1,2,3,4"))

;;Given newlines between numbers, add methods still works
(expect 10 (sum-a-string "1,2\n3,4"))

;;Given multicharacter numbers, the function still adds
(expect 20 (sum-a-string "19\n1"))

;;Given custom delimiters, function will use delimiter to seperate
(expect 3 (sum-a-string "//;1\n2"))

;;Given negative numbers, an exception will be handled
;;Exception handling in clojure is a neat idea
;;Let's make sure to come back
(expect Exception (sum-a-string "-1, 100"))


;;Numbers bigger than 1000 should be ignored
(expect 1 (sum-a-string "1001,1"))

;;Multicharacter delimiters to should be treated as separators
(expect 6 (sum-a-string "//[***]1***2***3"))

;;Allow multiple delimiters
(expect 6 (sum-a-string "//[*][%]1*2%3"))

;;Multiple delimiters of any length
(expect 6 (sum-a-string "//[*][%]1***2%%3"))
