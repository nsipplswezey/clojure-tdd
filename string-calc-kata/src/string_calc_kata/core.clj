(ns string-calc-kata.core
  (:gen-class))


;;function params are defined as vector following the name of the function
;;return values are whatever follows?
(defn sum-a-string [string]
  (if (empty? string)
    0
    (read-string string))
  )

