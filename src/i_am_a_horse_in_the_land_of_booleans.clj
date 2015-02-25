(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    (if(not= x nil)
    (if(not= x false)
    (if(= x "foo") true (if(= x (+ 2 3))
    true (if(= x true) true false))) false)
    false)
  )

(defn abs [x]
    (if(< x 0) (* x -1) x))

(defn divides? [divisor n]
  (if(= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
   (cond
       (= 0 (mod n 15)) "gotcha!"
       (= 0 (mod n 5)) "buzz"
       (= 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
   (if(>= age 13)
    (if(<= age 19) true false) false))

(defn not-teen? [age]
      (or (< age 13) (> age 19)))

(defn generic-doublificate [x]
  (cond
        (number? x) (+ x x)
        (empty? x) nil
        (vector? x) (+ (count x) (count x))
        (list? x) (+ (count x) (count x))
  :else true))

(defn leap-year? [year]
     (or  (and (= 0 (mod year 4))
     (not= 0 (mod year 100)))
     (= 0 (mod year 400))))

; '_______'
