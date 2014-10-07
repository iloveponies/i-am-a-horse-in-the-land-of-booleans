(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x](if x true false))

(defn abs [x] (if(< x 0)(- x) x))

(defn divides? [divisor n] (if(zero? (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n)"gotcha!"
    (divides? 5 n)"buzz"
    (divides? 3 n)"fizz"
     :else ""))

(defn teen? [age](if (>= 19 age 13) true false))

(defn not-teen? [age](if(not (teen? age)) true false))

(defn generic-doublificate [x]
  (cond
   (number? x)(* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

;(defn leap-year? [year] (or
                        ; (and (divides? 4 year) (not (divides? 100 year)))
                         ;(and (divides? 100 year) (divides? 400 year))))

  (defn leap-year? [year] (and
                           (divides? 4 year)
                           (or (not (divides? 100 year)) (divides? 400 year) )
                           ))

; '_______'
