(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;Implement (boolean x), which works like the built-in boolean function:
; for nil and false, it returns false, and for all other values it returns true. You can use if in its implementation, but not the build-in boolean.
(defn boolean [x]
  (if (or (nil? x) (false? x))
    false
    true
    ))

;Write the function (abs n), which returns the absolute value of n,
; i.e. if n<0, the value of (abs n) is −n, and otherwise n.
(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))


;Write the function (divides? divisor n), which returns true if divisor divides n and false otherwise.
(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false)
  )

;Write the function (fizzbuzz n) that returns
; "fizz" when n is divisible by 3,
; "buzz" when n is divisible by 5,
; "gotcha!" when n is divisible by 15, and
; the empty string "" otherwise.
(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

;Write the function (teen? age), which returns truthy if age is at least 13
; and at most 19. Use only one comparison operator and give it three arguments.
(defn teen? [age]
  (if (and (<= 13 age) (>= 19 age))
    true
    false))


;Write the function (not-teen? age), which returns true when teen?
;returns false and false otherwise.
(defn not-teen? [age]
  (not (teen? age)))

;Write a function (generic-doublificate x) that takes one argument and
;doubles it if it is a number,
;returns nil if it is an empty collection,
;if it is a list or a vector, returns two times the length of it
;returns true otherwise.
(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x)
        (vector? x)) (* 2 (count x))
    :else true
    ))


;Write the function (leap-year? year), which returns true if year is a
;leap year, otherwise false. A year is a leap year if it is divisible by 4,
;except if it is divisible by 100, in which case it still is a leap year if
;it is divisible by 400.
(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    :else true
    ))


; '_______'
