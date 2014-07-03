(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
  (if x true false))

(defn abs
  [x]
  (if (< x 0) (* -1 x) x))

(defn divides?
  [div n]
  (= (mod n div) 0))


(defn leap-year?
  [year]
  (or
   (divides? 400 year)
   (and (divides? 4 year)  (not (divides? 100 year)))))

(defn fizzbuzz [n]
   [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen?
  [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen?
  [age]
  (not (teen? age)))


; '_______'


(defn sign
  [x]
  (if (< x 0) "-" "+"))


(defn super-sign
  [number]
  (cond
   (neg? number) "negative"
   (pos? number) "postive"
   :else         "zero" ))



(defn generic-doublificate
  [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))
