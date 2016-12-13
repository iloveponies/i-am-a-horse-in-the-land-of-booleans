(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean])
  (:import (clojure.lang ISeq PersistentVector PersistentArrayMap)))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x) (* -1 x) x))

(defn divides? [divisor n]
  (if (> divisor n)
    false
    (integer? (/ n divisor))))

(defn fizzbuzz [n]
  (let [fizz-fn #(= (mod % 3) 0)
        buzz-fn #(= (mod % 5) 0)]
    (cond
      (and (fizz-fn n)
           (buzz-fn n)) "gotcha!"
      (fizz-fn n) "fizz"
      (buzz-fn n) "buzz"
      :else "")))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19)) true false))

(defn not-teen? [age]
  ((comp not teen?) age))

(defn doublify-coll [coll]
  (if (empty? coll)
    nil
    (* (count coll) 2)))

(defmulti doublifier class)
(defmethod doublifier ISeq [v]
  (doublify-coll v))
(defmethod doublifier PersistentVector [v]
  (doublify-coll v))
(defmethod doublifier PersistentArrayMap [v]
  (let [doublified-v (doublify-coll v)]
    (if doublified-v true nil)))
(defmethod doublifier Number [v] (* v 2))
(defmethod doublifier :default [v] true)  

(defn generic-doublificate [x]
  (doublifier x))

;; Passes tests :)
;(defn leap-year? [year]
;  (and
;    (= (mod year 4) 0)
;    (not= year 100)
;    (not= year 200)
;    ;(not= year 2200)))

(defn leap-year? [year]
  (or
    (and (=    (mod year 4) 0)
         (not= (mod year 100) 0))
    (and (=    (mod year 100) 0)
         (=    (mod year 400) 0))))

; '_______'
