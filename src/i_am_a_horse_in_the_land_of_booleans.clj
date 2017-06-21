(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)
    )
)

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n)   "gotcha!"
    (divides? 3 n)    "fizz"
    (divides? 5 n)    "buzz"
    :else             ""))

(defn teen? [age]
  (if (< age 13)
    false
    (if (> age 19)
      false
      true)
    )
)

(defn not-teen? [age]
  (cond
    (teen? age) false
    :else true))

(defn generic-doublificate [x]
  (cond
    (number? x)   (* x 2)
    (empty? x)    nil
    (list? x)     (* (count x) 2)
    (vector? x)   (* (count x) 2)
    :else         true))

(defn leap-year? [year]
  (cond
    (not (divides? 4 year))         false
    (not (divides? 100 year))       true
    (not (divides? 400 year))       false
    :else                            true))

; '_______'
