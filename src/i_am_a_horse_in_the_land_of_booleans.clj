(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]                                     ;=> Return false if x is false or nil
  (cond                                               ;=> Else return true
   (= x false) false
   (= x nil)   false
    :else      true))


(defn abs [x]                                         ;=> If x negative number return -1*x
  (if (< x 0) (* -1 x) x))                            ;=> Else return x


(defn divides? [divisor n]                            ;=> Return true if n divisible by divisor
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]                                    ;=> Prints "fizz", "buzz", "gotcha!"
  (cond                                               ;=> or empty string depending on input
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 5))  "buzz"
   (= 0 (mod n 3))  "fizz"
    :else ""))

(defn teen? [age]                                     ;=> Return true if age is 13 at least
  (if (<= 13 age 19) true false))                     ;=> and 19 at most


(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)                                ;=> If x number return times two
   (empty? x) nil                                     ;=> If x empty set return nil
   (or (list? x) (vector? x)) (* 2 (count x))         ;=> If x list, vector return length*2
    :else true
   ))

(defn leap-year? [year]
  (cond
   (or
    (divides? 400 year)                               ;=> Return true if divisible by 400
    (and (divides? 4 year)                            ;=> Return true if divisible by 4
         (not (divides? 100 year)))) true             ;=> and not divisible by 100
   :else false))                                      ;=> Else return false



; wot
