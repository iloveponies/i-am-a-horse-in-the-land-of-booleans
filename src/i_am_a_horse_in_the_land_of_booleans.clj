(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))


(defn abs [x]
  (if (neg? x) (* -1 x) x))

(defn divides? [divisor n]
  (zero? (mod n divisor)))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x)
   (* 2 x)
   (coll? x)
   (if (empty? x)
     nil
     (if (or (vector? x) (list? x))
       (* 2 (count x))
       true))))

(defn leap-year? [year]

  ;; div by 100 AND 400 -> leap
  ;; div by 4 and not 100 (or 100 ja 400) -> leap
  ;; not leap

  (and (divides? 4 year)
       (or
        (not (divides? 100 year))
        (and
         (divides? 100 year)
         (divides? 400 year)))))

; '_______'
