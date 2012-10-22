(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x] (if (= x nil) false (if (= x false) false true)))

(defn abs [x] (if (< x 0) (- x) x))

(defn divides? [divisor n]  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n] (cond
                      (== 0 (mod n 15)) "gotcha!"
                      (== 0 (mod n 3))  "fizz"
                      (== 0 (mod n 5))  "buzz"
                      :else             ""))

(defn teen? [age] (if (<= 13 age 19) true false))

(defn not-teen? [age] (if (teen? age) false true))

(defn generic-doublificate [x] (cond
                                 (number? x) (* x 2)
                                 (empty? x)  nil
                                 (vector? x) (* 2 (count x))
                                 (list? x)   (* 2 (count x))
                                 :else       true))

(defn leap-year? [year] (cond
                          (== 0 (mod year 400)) true
                          (== 0 (mod year 100)) false
                          (== 0 (mod year 4))   true
                          :else false))