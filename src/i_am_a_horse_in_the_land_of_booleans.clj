(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
   (not (or (nil? x)(false? x))))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n)  "buzz"
     (divides? 3 n)  "fizz"
     :else            ""
   ))

(defn teen? [age]
  (and (>= age 13)(<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x)(* 2 x)
     (or (list? x)(vector? x))
       (if (empty? x) nil (* 2 (count x)))
     (and (coll? x)(empty? x)) nil
     :else true
   ))

(defn leap-year? [year]
  (if (and (divides? 4 year)(not (divides? 100 year))) true
     (and (divides? 100 year)(divides? 400 year))))

; '_______'
