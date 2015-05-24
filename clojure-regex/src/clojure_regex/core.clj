(ns clojure-regex.core
  (:gen-class))

(defn match-scientific [input]
  (clojure.core/re-seq #"^-?\d+(,\d+)*\.?\d+e?\d+$" input)
  )

(first (first (match-scientific "-100")))



(defn re-find-scientific [input]
  (clojure.core/re-find #"^-?\d+(,\d+)*(\.\d+(e\d+)?)?$" input)
  )




(match-scientific "10.46")
(re-find-scientific "10.46")

(re-find-scientific "7.2e2")
