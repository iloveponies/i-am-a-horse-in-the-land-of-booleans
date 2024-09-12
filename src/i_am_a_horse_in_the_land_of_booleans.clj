(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
  (= x nil) false
  (= x false) false
  :else true
  )
)


(defn abs [x]
  (max x (- x))
)

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false)
)

(defn fizzbuzz [n]
  (cond
  (= (=(divides? 5 n) true) (divides? 3 n) true) "gotcha!"
  (divides? 3 n) "fizz"
  (divides? 5 n) "buzz"
  :else "")
)

(defn teen? [age]
  (if(< 12 age 20) true false)
)

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond
  (= (number? x) true) (* x 2)
  (= (empty? x) true) nil
  (= true (list? x)) (* 2 (count x))
  (= true (vector? x)) (* 2 (count x))
  :else true)
)

(defn leap-year? [year]
  (cond (zero? (mod year 400)) true
        (zero? (mod year 100)) false
        (zero? (mod year 4)) true
        :default false)
)
; '_______'

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false