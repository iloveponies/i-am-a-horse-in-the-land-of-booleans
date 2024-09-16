(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) ; Conditional
  false              ; If true
  (if (= x false) ; Conditional
  false              ; If true
  true))              ; If false
 )



(defn abs [x]
  (if (> x 0) ; Conditional
  x              ; If true
  (- x))
  )

(abs 43)

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false)
  )



(defn fizzbuzz [n]
  (cond
     (= 0 (mod n 15)) "gotcha!"
     (= 0 (mod n 3)) "fizz"
     (= 0 (mod n 5)) "buzz"
     :else ""
   )
)

(fizzbuzz 70)

(defn teen? [age]
  (if (false? (< 12 age 20 )) ; Conditional
  false              ; If true
  true)
  )


(defn not-teen? [age]
   (not (teen? age))
  )

(not-teen? 20)




(defn generic-doublificate [x]
  (cond
      (true? (number? x)) (* 2 x)
      (empty? x) nil
      (or (list? x) (vector? x)) (* 2 (count x))
      :else true
     )
  )




;if (year is not exactly divisible by 4) then (it is a common year)
; else if (year is not exactly divisible by 100) then (it is a leap year)
; else if (year is not exactly divisible by 400) then (it is a common year)
; else (it is a leap year)

(defn leap-year? [year]
  (cond
     (not= (mod year 4) 0) false
     (not= (mod year 100) 0) true
     (not= (mod year 400) 0) false
     :else true
   )

  )


(not= (mod 100 4) 0)

(leap-year? 15)




; '_______'
