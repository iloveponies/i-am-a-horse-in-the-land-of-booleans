(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (> x 0) x (- x))
)

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false)
)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15))  "gotcha!"
    (= 0 (mod n 3))   "fizz"
    (= 0 (mod n 5))   "buzz"

    :else             ""))

(defn teen? [age]
  (if (> 20 age 12) true false)
  )

(defn not-teen? [age]
  (if (teen? age) false true)
)

(defn generic-doublificate [x]
  (cond
    (number? x)   (* 2 x)
    (empty? x)    nil
    (list? x)     (* 2 (count x))
    (vector? x)   (* 2 (count x))
    :else         true))

(defn leap-year? [year]
  (cond
    (or (and (= 0 (mod year 4)) (not (= 0 (mod year 100)))) (= 0 (mod year 400))) true
    :else                                        false
  ))

; '_______'

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false

