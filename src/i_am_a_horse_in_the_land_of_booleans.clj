(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (or (= x false) (= x nil))
                    false
                    true))

(defn abs [x] (if (< x 0)
                (- x)
                x))

(defn divides? [divisor n] (if (= 0 (mod n divisor))
                             true
                             false))

(defn fizzbuzz [n] (cond
                     (divides? 15 n) "gotcha!"
                     (divides? 3 n) "fizz"
                     (divides? 5 n) "buzz"
                     :else "" ))

(defn teen? [age] ( if (and (<= age 19) (>= age 13))
                    true
                    false))  

(defn not-teen? [age] (if (and (<= age 19) (>= age 13))
                        false
                        true))

(defn generic-doublificate [x] (cond (number? x) (* x 2)
                                     (empty? x) nil
                                     (vector? x) (* 2 (count x))
                                     (list? x) (* 2 (count x))
                                     :else true))

(defn leap-year? [year] (cond (= 0 (mod year 400)) true
                              (= 0 (mod year 100)) false
                              (= 0 (mod year 4)) true
                              :else false)
  )

; '_______'
