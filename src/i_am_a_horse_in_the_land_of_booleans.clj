(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "return true if x = foo "
  (if (or (= x false )(= x nil))
    false
    true))

;; (boolean "foo") ;=> true
;; (boolean nil) ;=> false
;; (boolean (+ 2 3)) ;=> true
;; (boolean true) ;=> true
;; (boolean false) ;=> false


(defn abs [x]
  (if (> 0 x)
    (* -1 x)
    x))

(defn divides?
  [divisor n]
  "return true if dividor divide n"
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  "(int)-> boolean"
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
     :else ""))


(def liste [2 45 48 70])
(defn test
  [function liste]
  (map function liste))

(defn teen? [age]
  "return true if 13<age<19"
  (if (and (<= 13 age) (>= 19 age))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x ) (* 2 x)
    (empty? x) nil
    (or (list? x)(vector? x) ) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  "(int)->boolean"
  (cond
    (= 0 (mod year 100))  (if (= 0 (mod year 400))
                            true
                            false)

   (= 0 (mod year 4)) true
  :else false)
  )


;;  (leap-year? 100) ;=> false
;;  (leap-year? 200) ;=> false
;; (leap-year? 400);=> true
;;   (leap-year? 12)  ;=> true
;;   (leap-year? 20)  ;=> true
;;   (leap-year? 15)  ;=> false



;; (def liste-5 [2 45 48 70])
;; (def liste-6 [1 [1 2] '(65 21) {} [] {:a 1}])
;; (def liste-7 [13 25 12 19 20])
;; (def liste-8 [100 200 400 12 20 15])
;; (defn my-test
;;   [function liste]
;;   (map function liste))

