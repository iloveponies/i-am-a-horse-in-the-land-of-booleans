(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 5) 0) "buzz"
   (== (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (< age 13)
    (boolean false)
    (if (> age 19)
      (boolean false)
      (boolean true))))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (if
    (and (== (mod year 4) 0)
         (not (== (mod year 100) 0)))
    true
    (if (and (== (mod year 100) 0)
         (== (mod year 400) 0))
      true
      false)))

; '_______'
