(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0) x (- 0 x)))

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

(defn not-teen? [age]
  (if (< 12 age 20 ) false true))



(defn teen? [age]
 (not (not-teen? age))
  )

(defn generic-doublificate [x]
   (cond (number? x)(* 2 x)
        (empty? x) nil
        (list? x) (* 2 (count x))
        (vector? x)(* 2 (count x))
        :else true
 )
)

;;helper fonction which defines if a year is finishing by 00
(defn century? [year]
  (if (== 0 (mod year 100)) true false)
  )


(defn leap-year? [year]
  (if (== 0 (mod year 4)) (if (century? year) (leap-year? (/ year 100)) true) false)
  )

; '_______'
