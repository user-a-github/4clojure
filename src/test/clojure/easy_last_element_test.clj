(ns easy-last-element-test
  (:use [clojure.test]
        [easy :only [last_element]])
  )

(deftest should-return-last-element-for-collection
  (is (= (last_element [1 2 3 4 5]) 5)))

(deftest should-return-nil-for-empty-collection
  (is (nil? (last_element []))))

(deftest should-return-nil-for-nil
  (is (nil? (last_element nil))))