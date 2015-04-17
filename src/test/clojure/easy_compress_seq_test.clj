(ns easy-compress-seq-test
  (:use [clojure.test]
        [easy :only [compress_seq]])
  )

(deftest should-return-last-element-for-collection
  (is (= (apply str (compress_seq "Leeeeeerrroyyy"))) "Leroy"))
(is (= (compress_seq [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
(is (= (compress_seq [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
  )

(deftest should-compress-empty-sequence
  (is (= (compress_seq []) '())))

(deftest should-compress-nil
  (is (nil? (compress_seq nil))))