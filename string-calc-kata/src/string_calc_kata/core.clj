(ns string-calc-kata.core
  (:gen-class))


;;private helpers are a product of refactor
(defn- string-to-numbers [string]
  ;;using regex to generate a sequence of integers
  ;;that are digits
  (map read-string (re-seq #"\d+|-\d+" string)))


;;function params are defined as vector following the name of the function
;;return values are whatever follows?
(defn sum-a-string [string]
  ;;we can define variables using let
  ;;but it only remains defined inside of that clojure
  (let [numbers (string-to-numbers string)]

    ;;when-let allows us to define variables conditionally
    ;;and execute code
    ;;when x is true, then define y, and execute code
    ;;so first we filter out negative numbers
    ;;and we assign that coll to negative-numbers
    (when-let [negative-numbers (not-empty (filter neg? numbers))]

      ;;then we want to throw an exception!
      ;;and print the string
      ;;this comes at the cost of lazy sequences
      ;;since pr-str prints the whole collection
      ;;and str would just print the Object identity
      (throw (Exception. (pr-str "Negatives not allowed: " negative-numbers))))


    ;;split the string on comma
    ;;map readstring to each element
    ;;reduce the collection of elements with +
    ;;reduce on an empty collection returns 0
    (reduce + (filter #(< % 1000) numbers))))
