(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "a shot at implementing boolean" [x] (if (or(= x nil) (= x false))false true))

(defn abs [x] (if (> x 0) x (- x (* x 2))))

(defn divides? [divisor n] (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n] (cond
                    (divides? 15 n) "gotcha!"
                    (divides? 5  n) "buzz"
                    (divides? 3  n) "fizz"
                    :else ""))

(defn teen? [age] (if(< 12.9999999999999 age 20)true false))

(defn not-teen? [age] (if(< 12.999999999999 age 20)false true))

(defn generic-doublificate [x] (cond
                                 (number? x)  (* x 2)
                                 (empty?  x)  nil
                                 (list?   x)  (* 2 (count x))
                                 (vector? x)  (* 2 (count x))
                                 :else        true))

(defn leap-year? [year] (cond
                          (divides? 400 year) true
                          (and (divides? 4 year) (not (divides? 100 year))) true
                          :else false))

; '_______'
