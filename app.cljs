(ns app
  (:require ["moment$default" :as moment]
            ["inquirer$default" :as inquirer]
            [promesa.core :as p]))

(println "Questionaire ")

(def questions (clj->js[{ :name "name" 
                          :type "input"
                          :message "Who's birthday is it?"}
                        {:name "day"
                         :type "number"
                         :message "What day is their birthday?"}]))

(p/let [_answers (inquirer/prompt questions)
        answers (js->clj _answers :keywordize-keys true) 
        name (.-name answers)
        day (.-day answers)]
  (println answers)) 

(comment
  moment () .year ()
  (.year (moment))
  )
