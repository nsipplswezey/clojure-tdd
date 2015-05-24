(ns clojure-regex.core-test
  (:require ;;[clojure.test :refer :all]
            [expectations :refer :all]
            [clojure-regex.core :refer :all]))


;;It should optionally match a leading -
(expect (first (first (match-scientific "-100"))) "-100")

(expect (first (first (match-scientific "100"))) "100")

;;It should optionally match a decimal point
(expect (first (first (match-scientific "10.25"))) "10.25")

;;It should optionally match scientific notation
(expect (first (first (match-scientific "10e7"))) "10e7")

;;It should optionally match any number of commas
(expect (first (first (match-scientific "10,000,100.15"))) "10,000,100.15")

;;It should return nill for any string that doesnt end with a number
(expect nil (first (first (match-scientific "100asde"))))

;;The use of first first is because the function returns a collection
;;Which contains a vector of results
;;So the first element of the collection is the vector
;;And the first element of the fector is the matched string
;;And we're done!

;;What did we learn?
;;1. tdd in clojure is actually pretty fun.
;;expect is light weight. And I have a simple project to build off of

;;2. Regex with re-seq vs re-find is just about the same
;;re-seq presents the results in a collection
;;re-find doesn't

;;3. Capturing a group produced a vector of results!
;;Which kind of threw me. Results that match the group/subgroup
;;get added to the vector of results

;;4. The behavior of the wildcard on a subgroup is pretty gnarly
;;Using the + instead of the * on a subgroup, constrains results
;;To include the subgroup. The subroup looks flexible. But it can be restrictive
;;And it can dump extra partial results into your collection/vector
;;And can it be optional? Not that I can tell.
