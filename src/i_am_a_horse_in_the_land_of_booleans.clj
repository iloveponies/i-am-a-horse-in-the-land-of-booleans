(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))
 
(defn boolean [x]
  (if(or(false? x)(nil? x))
    false
    true))
 
(defn abs [x]
  (if(< x 0)
    (* -1 x)
    x))
 
 
(defn divides? [divisor n]
  (if(== 0 (rem n divisor))
    true
    false))
 
(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n)"buzz"
   (divides? 3 n)"fizz"
   :else ""))
 
 
(defn teen? [age]
  (if(and(> age 12)(< age 20))
    true
    false))
 
(defn not-teen? [age]
  (if(and(> age 12)(< age 20))
    false
    true))
 
(defn generic-doublificate [x]
  (cond
   (number? x)(* x 2)
   (empty? x)nil
   (or(vector? x)(list? x))(* 2 (count x))
   :else true))
 
(defn leap-year? [year]
  (if (divides? 4 year)
    (if(divides? 100 year)
      (if(divides? 400 year)
        true
        false)
      true)
    false))
