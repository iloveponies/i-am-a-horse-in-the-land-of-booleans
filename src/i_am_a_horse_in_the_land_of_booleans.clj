(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))


(defn abs [x]  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n] (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n] (cond
                    (== (mod n 15) 0) "gotcha!"
                    (== (mod n 5) 0) "buzz"
                    (== (mod n 3) 0) "fizz"
                    :else ""))

(defn teen? [age] (if (< 12 age 20) true false))


(defn not-teen? [age] (if (not(teen? age)) true false))


(defn generic-doublificate [x] (cond
                                (= (number? x) true) (* x 2)
                                (= (empty? x) true) nil
                                (= (list? x) true) (* 2 (count x))
                                (= (vector? x) true) (* 2 (count x))



                                :else true))

(defn leap-year? [year] (if (= (mod year 4) 0)
                          (if (= (mod year 100) 0)
                            (if (= (mod year 400) 0)
                              true false)
                            true)
                          false))



; '_______'
