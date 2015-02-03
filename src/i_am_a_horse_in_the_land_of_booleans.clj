(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false) )

; (boolean false )

(defn abs [x]
  (if (< x 0) (- x) x ))

; (abs -1)

(defn divides? [divisor n]
  ; (if
    (= (mod n divisor) 0) )
    ; true false ) )

; (divides? 5 15)

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else          ""
   ))

; (fizzbuzz 45)
(defn teen? [age]
  ; ( if (> age 12 ) (if (< age 20 ) true false) false ))
  (< 12 age 20)
  )
; (teen? 20)

(defn not-teen? [age]
  (not (teen? age) ) )

; (not-teen? 13)

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty?  x) nil
   (list?   x) (* 2 (count x) )
   (vector?   x) (* 2 (count x) )
   :else true
   ))

; (generic-doublificate (vector) )
(defn leap-year? [year]
  (or
   (divides? 400 year)
   (and (divides? 4 year) (not (divides? 100 year)) )
   )

  )
; (leap-year? 2012)
; '_______'
