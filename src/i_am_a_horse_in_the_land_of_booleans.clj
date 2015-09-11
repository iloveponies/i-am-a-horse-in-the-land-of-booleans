(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
   false
   (if (= x false)
     false
     true)))

(defn abs [x]
  (if (< x 0)
    (- x (* 2 x)) 
    x)) 

(defn divides? [divisor n]
  (if(= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (if ( = (mod n 15 ) 0)
    "gotcha!"
   (if (= (mod n 3) 0)
     "fizz"
       (if (= (mod n 5) 0)
         "buzz"
          ""))))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if(teen? age)
    false true))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
     (if (empty? x)
       nil
        (if (list? x)
          (* (count x) 2)
            (if (vector? x)
              (* (count x) 2)
               true )))))

(defn leap-year? [year]
  (if (not (= (mod year 4) 0))
    false
    (if (not (= (mod year 100) 0))
      true
      (if (not (= (mod year 400) 0))
               false
               true))))

; '_______'
