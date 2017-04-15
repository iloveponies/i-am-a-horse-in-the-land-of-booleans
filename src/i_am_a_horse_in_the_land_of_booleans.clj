(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false) )

(defn abs [x]
  (if (< 0 x) x (- x x x) ))

(defn divides? [divisor n]
  (if (< 0 (mod n divisor)) false true))

(defn fizzbuzz [n]
  (if
    (== 0 (mod n 15)) "gotcha!"
    (if (== 0 (mod n 5)) "buzz"
      (if (== 0 (mod n 3)) "fizz" "")
      )
    )
  )

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (if (< 12 age 20) false true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn leap-year? [year]
  (if (== 0 (mod year 400)) true (if (== 0 (mod year 100)) false (if (== 0 (mod year 4)) true false ))))

; '_______'
