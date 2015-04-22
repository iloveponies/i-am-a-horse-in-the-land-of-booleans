(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
    (if (> x 0)
    x
    (* x -1)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [x]  (cond
                     (= 0 (mod x 15)) "gotcha!"
                     (= 0 (mod x 5)) "buzz"
                     (= 0 (mod x 3)) "fizz"
                     :else ""))

(defn teen? [age]
  (< 12 age 20))


(defn not-teen? [x]
  (if  (< 12 x 20)
    false
    true
    ))

(defn generic-doublificate [x]  (cond
                     (number? x) (* 2 x)
                     (empty? x) nil
                     (or (list? x) (vector? x)) (* 2 (count x))
                     :else true))


 (defn leap-year? [x]
  (cond
   (= 0 (mod x 400)) true
   (and (= 0 (mod x 4) ) (not(= 0 (mod x 100)))) true
   :else false))

; '_______'
