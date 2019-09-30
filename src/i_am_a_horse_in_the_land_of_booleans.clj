(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean])
)

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (>= x 0) x (* x -1))
)

(defn divides? [divisor n]
  (== (mod n divisor) 0)
)

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n)  "fizz"
   (divides? 5 n)  "buzz"
   :else           ""
  )
)

(defn teen? [age]
  (if (<= 13 age 19) true false)
)

(defn not-teen? [age]
  (not (teen? age))
)


(defn generic-doublificate [x]
  (cond
   (number? x)                  (* 2 x)
   (empty? x)                   nil
   (or (list? x) (vector? x))   (* 2 (count x))
   :else                        true
  )
)


(defn leap-year? [year]
  (cond
    (and (divides? 4 year) (< year 100)) true
    (and (divides? 4 year) (not (divides? 100 year)) (< year 400)) true
    (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))) true
    :else false
  )
)

; '_______'
