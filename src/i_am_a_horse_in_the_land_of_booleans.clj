(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false) false (if (= x nil) false true)))

(defn abs [x]
  (if (< x 0) (* -1 x) x))


(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false))

(defn fizzbuzz [n] 
    (cond (= (mod n 15) 0) "gotcha!"
          (= (mod n 3) 0) "fizz"
          (= (mod n 5) 0) "buzz"
          :else ""   
      )
  )

(defn teen? [age]
  (if (> age 19) false (if (< age 13) false true)))

(defn not-teen? [age] 
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond (number? x) (* x 2); Jos numer, tuplaa
        (coll? x) ( if (or (list? x) (vector? x)) (if (empty? x) nil (* 2 (count x))) (if (empty? x) nil true) )
  )
)

(defn leap-year? [year] 
  (cond (== 0 (mod year 400)) true
        (== 0 (mod year 100)) false
        (== 0 (mod year 4)) true
        :else false
        )
  )

; '_______'
