(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
(if x true false)
)


(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if(== (mod n divisor) 0)true false))

(defn fizzbuzz [n]
  (cond(==(mod n 15) 0) "gotcha!"
       (==(mod n 5) 0)"buzz"
       (==(mod n 3) 0)"fizz"
       :else ""
          ))

(defn teen? [age]
  (cond (== 13 age ) true
        (== 14 age ) true
        (== 15 age ) true
        (== 16 age ) true
        (== 17 age ) true
        (== 18 age ) true
        (== 19 age ) true
        :else false
       ) )

(defn not-teen? [age]
 (cond (== 13 age ) false
        (== 14 age ) false
        (== 15 age ) false
        (== 16 age ) false
        (== 18 age ) false
        (== 19 age ) false
        :else true
       ))

(defn generic-doublificate [x]
(cond (number? x ) (* 2 x)
      (coll? x)
        (cond
          (empty? x) nil
          (list? x)(* 2 (count x))
          (vector? x) (* 2 (count x))
          :else true)

      :else true

      ))


(defn leap-year? [year]
 (cond (zero? (mod year 400)) true
        (zero? (mod year 100)) false
        (zero? (mod year 4)) true
        :default false))



; '______'
