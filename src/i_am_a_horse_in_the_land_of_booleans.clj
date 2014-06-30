(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (= x nil) false (if (= x false) false true )))

(defn sign [x]
  (if (< x 0)
    "-"
    "+")
  )

(defn abs [x]
  (if (= (sign x) "-") (* -1 x) x)
      )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5  n) "buzz"
     (divides? 3  n) "fizz"
    :else ""
  ))


(defn teen? [age] (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if
     (or (< age 13 ) (> age 19))
     true
     false
     )
  )


(defn generic-doublificate [x]
  (cond

   (number? x) (* 2        x)
   (empty?  x) nil
   (list?   x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
   )

  )

(defn leap-year? [year]
  ":(")

; '_______'
