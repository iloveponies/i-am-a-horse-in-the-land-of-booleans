(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
 (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   	(divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn leap-year? [year]
  (cond
   	(== 0 (mod year 400)) true
    (== 0 (mod year 100)) false
    (== 0 (mod year 4)) true
    :else false))

(defn generic-doublificate [x]
  (cond
   	(number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (cond
                                (empty? x) nil
                                :else (map #(* 2 %) x))
    :else true))