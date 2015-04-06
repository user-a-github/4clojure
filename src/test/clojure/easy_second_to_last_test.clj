(ns easy-second-to-last-test
  (:use [clojure.test]
        [easy :only [second_to_last]])
  )

(deftest should-return-last-element-for-collection
  (is (= (second_to_last [1 2 3 4 5]) 4)))

(deftest should-return-nil-for-empty-collection
  (is (nil? (second_to_last []))))

(deftest should-return-nil-for-one-element-collection
  (is (nil? (second_to_last [1]))))

(deftest should-return-nil-for-nil
  (is (nil? (second_to_last nil))))