# ============================================
# HashMap Cheat Sheet (DSA & Interviews)
# ============================================

type HashMap {
  definition: String
  timeComplexity: TimeComplexity
  whyImportant: [String]
  javascriptMap: JavaScriptMap
  javaHashMap: JavaHashMap
  patterns: [Pattern]
  commonMistakes: [String]
  interviewTips: [String]
  popularProblems: [String]
}

type TimeComplexity {
  insert: String
  search: String
  delete: String
}

type JavaScriptMap {
  create: String
  set: String
  get: String
  has: String
  delete: String
  size: String
  clear: String
}

type JavaHashMap {
  create: String
  put: String
  get: String
  containsKey: String
  remove: String
  size: String
}

type Pattern {
  name: String
  code: String
  useCase: String
}

# ============================================
# DATA
# ============================================

HashMap {
  definition: "Stores data in key-value pairs with fast lookup"
  
  timeComplexity: {
    insert: "O(1)"
    search: "O(1)"
    delete: "O(1)"
  }

  whyImportant: [
    "Reduces time complexity from O(n^2) to O(n)",
    "Used in interviews and LeetCode problems",
    "Best for fast lookup and existence check",
    "Helps in frequency counting and index mapping"
  ]

  javascriptMap: {
    create: "let map = new Map();"
    set: "map.set(key, value);"
    get: "map.get(key);"
    has: "map.has(key);"
    delete: "map.delete(key);"
    size: "map.size;"
    clear: "map.clear();"
  }

  javaHashMap: {
    create: "HashMap<Integer, Integer> map = new HashMap<>();"
    put: "map.put(key, value);"
    get: "map.get(key);"
    containsKey: "map.containsKey(key);"
    remove: "map.remove(key);"
    size: "map.size();"
  }

  patterns: [
    {
      name: "Value to Index Mapping (Two Sum)"
      code: "map.set(nums[i], i);"
      useCase: "Used when returning indices or finding complements"
    },
    {
      name: "Complement Check"
      code: "if (map.has(target - nums[i])) return [map.get(target - nums[i]), i];"
      useCase: "Used in Two Sum and pair sum problems"
    },
    {
      name: "Frequency Count"
      code: "map.set(x, (map.get(x) || 0) + 1);"
      useCase: "Used in anagrams and character counting"
    },
    {
      name: "Check Before Insert"
      code: "if (!map.has(x)) map.set(x, i);"
      useCase: "Avoids duplicates and keeps first occurrence"
    }
  ]