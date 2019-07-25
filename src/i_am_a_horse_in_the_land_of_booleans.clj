(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    (if x true false)
)


(defn abs [x]
    (if (< x 0) (- 0 x) x)
)



(defn divides? [divisor n]
    (== 0 (mod n divisor))
)

(defn fizzbuzz [n]
    (cond
        (divides? 15 n) "gotcha!"
        (divides? 3 n) "fizz"
        (divides? 5 n) "buzz"
        :else "" )
)

(defn teen? [age]
    (< 12 age 20)
)

(defn not-teen? [age]
    (if (teen? age) false true)
)


(defn generic-doublificate [x]
    (cond
        (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x)) 
        :else true )
)

(defn leap-year? [year]
    (cond
        (divides? 400 year) true
        (and (divides? 4 year) (not (divides? 100 year))) true
        :else false)
)

; '_______'
