(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn boolean [x] (if (= x nil) false (if (= x false) false true)))



(defn abs [x](if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if (< (mod n divisor) 1)
    true
    false))

(defn fizzbuzz [n]
  (if (= (mod n 15) 0)
    "gotcha!"
    (if (=(mod n 5)0)
    "buzz"
      (if (=(mod n 3)0)
        "fizz"
        ""))))

(defn teen? [age]
  (if (<= age 19)
    (if (>= age 13) true false)
    false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (if (number? x) (+ x x)
    (if (coll? x) (if (empty? x) nil
   (if (vector? x) (* 2 (count x))
    (if (list? x) (* 2 (count x))
          true) ) ) ) ) )

(defn leap-year? [year]
  (if (= 0 (mod year 4))
     (if (= 0 (mod year 100))
       (if(= 0 (mod year 400)) true false) true)false))


; '_______'
