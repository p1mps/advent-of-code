(ns p1mps.2022-day1
  (:require [clojure.string :as string]))


(def input
  (slurp "resources/day1-input.txt"))


(def data
  (->> (string/split-lines input)
       (partition-by (partial = ""))
       (remove #{'("")})))


(def sum-data
  (for [d data]
       (let [vals (map read-string d)]
         (apply + vals))))


(->> (take 3 (reverse (sort sum-data)))
     (apply +))
