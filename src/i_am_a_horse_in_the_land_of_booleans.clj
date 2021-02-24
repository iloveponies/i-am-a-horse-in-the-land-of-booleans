(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (let [mod5 (mod n 5)
        mod3 (mod n 3)]
    (cond
     (and (= 0 mod5) (= 0 mod3)) "gotcha!"
     (= 0 mod5) "buzz"
     (= 0 mod3) "fizz"
     :else "")))

(defn teen? [age]
  (and (> age 12) (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (= 0 (mod year 100)) false
   :else (= 0 (mod year 4))))

; '_______'
