(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true
    ))

(defn abs [x]
  (if (< x 0)
    (- x)
    x
    ))

(defn divides? [divisor n]
  (if (not= 0 (mod n divisor))
    false
    true))


(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
   :else ""
   ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   )
)

(defn leap-year? [year]
  (or (divides? 400 year) (and (not (divides? 100 year)) (divides? 4 year )))

  )


; '_______'
