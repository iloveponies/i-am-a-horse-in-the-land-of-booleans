(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] "acts like the built-in boolean function"
  (if (or (= x false) (= x nil))
    false
    true  
  )
)

(defn abs [x] "returns the absolute value of x"
  (if (< x 0)
    (- x)
    x
  )
)

(defn divides? [divisor n] "returns true if divisor divides n truly"
  (if (= 0 (mod n divisor))
    true
    false
  )
)

(defn fizzbuzz [n] "returns the fizzbuzz value of n"
  (cond (and (divides? 3 n) (divides? 5 n)) "gotcha!"
        (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        :else   "" 
  ) 
)


(defn teen? [age] "returns true if age is in its teens"
  (if (and (> age 12) (< age 20)) true false)
)

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond (number? x) (* x 2)
        (empty? x) nil
        (list? x) (* 2 (count x))
        (vector? x) (* 2 (count x))
        :else true
  )
)

(defn leap-year? [year]
  (cond (divides? 400 year) true
        (divides? 100 year) false
        (divides? 4 year) true
        :else false )
)

; '_______'
