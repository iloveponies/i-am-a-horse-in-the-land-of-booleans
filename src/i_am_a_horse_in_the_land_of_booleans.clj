(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) 
    false
    true))

(defn abs [x]
  (if (< x 0) 
      (* x -1)
      x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) 
    true 
    false))

(defn fizzbuzz [n]
  (let [divisible-by-3 (divides? 3 n)
        divisible-by-5 (divides? 5 n)
        divisible-by-15 (divides? 15 n)] 
        (if (and divisible-by-3 divisible-by-5 divisible-by-15)
            (str "gotcha!")
            (if divisible-by-3
                (str "fizz")
                (if divisible-by-5
                    (str "buzz")
                    (if divisible-by-15
                        (str "fizzbuzz")
                        (str "")))))))


(defn teen? [age]
    (if (and (<= age 19) (>= age 13))
        true
        false))

(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (if (number? x) 
      (* 2 x)
      (if (empty? x)
        nil
        (if (or (list? x) (vector? x))
          (* 2 (count x))
          true))))

(defn leap-year? [year]
  (let [divisible-by-4 (divides? 4 year)
        divisible-by-100 (divides? 100 year)
        divisible-by-400 (divides? 400 year)]
       (if divisible-by-4
           (if divisible-by-100
               (if divisible-by-400
                   true
                   false)
               true)
           false)))

; '_______'
