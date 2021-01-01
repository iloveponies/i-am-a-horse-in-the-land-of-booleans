(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= nil x)
    false
    (if (= false x)
      false
      true
    )
  )
)

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5  n) "buzz"
    (divides? 3  n) "fizz"
    :else ""))

(defn teen? [age]
  (if (< age 13)
    false
    (if (> age 19)
      false
      true)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)   (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else       true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4   year) true
    :else               false))

; '_______'

(defn super-sign
  [number]
  (cond
        (neg? number) 'negative
        (pos? number) 'positive
        :else         'zero))

