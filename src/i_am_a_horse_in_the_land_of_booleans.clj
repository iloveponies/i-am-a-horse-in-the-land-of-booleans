(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x)
  )

(defn divides? [divisor n]
  (== 0 (mod n divisor))
)

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 3 n) "fizz"
     (divides? 5 n) "buzz"
   :else ""
   )
  )

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
    (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (list? x) (* 2 (count x))
     (vector? x) (* 2 (count x))
     :else true
   )
  )

(defn leap-year? [year]
  (cond
     (== 0 (mod year 400 )) true
     (== 0 (mod year 100)) false
     (== 0 (mod year 4)) true
     :else false
   )
  )

; '_______'
