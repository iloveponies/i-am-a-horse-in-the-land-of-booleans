(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))




(defn boolean [x]
  (if x true false))



(defn abs [x]
  (if (> x 0) x (- x)))




(defn divides? [divisor n]
  (== 0 (mod n divisor)))



;; The super "cond" experssion 
(defn fizzbuzz 
"The fizz buzz"
  [n]
 (cond 
  (== 0 (mod n 15) ) "gotcha!"
  (== 0 (mod n 5)) "buzz"
  (== 0 (mod n 3)) "fizz"
  :else ""
))



(defn teen? [age]
  (<= 13 age 19))



(defn not-teen? [age]
(not (teen? age)) )




(defn generic-doublificate [x]
  (cond 
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   "else" true
))



(defn leap-year? [year]
  (let [div100? (divides? 100 year)
        div400? (divides? 400 year)]
    (cond
      div400? true
      div100? false
      (divides? 4 year) true
      :else false)
))
      

; '_______'
