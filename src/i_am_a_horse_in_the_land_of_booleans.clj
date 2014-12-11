(ns i-am-a-horse-in-the-land-of-booleans)

(defn boolean [x]
  (if (or
        (= false x)
        (= nil x))
    false
    true))

(defn abs [n]
  (if (< n 0)
    (* -1 n)
    n))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (and (<= age 19) (>= age 13))
    true
    false))

; (defn teen? [age]
;   (<= 13 age 19))


(defn not-teen? [age]
  (not (teen? age)))

; (defn not-teen? [age]
;   (or
;     (not
;       (and
;         (>= age 13)
;         (<= age 19)))
;     false))

(defn generic-doublificate [n]
  (cond
    (number? n) (* 2 n)
    (empty? n) nil
    (or (list? n) (vector? n)) (* (count n) 2)
    :else true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'
