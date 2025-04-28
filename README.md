# Students API coding exercise

This API is designed to returns a list of student data that matches the provided criteria.

This API should satisfy the following requirements:

- `name`: The wildcard search on the full name of the student to search for (optional). For example, if the name
    is "John", it should return all students with names like "John Doe", "John Smith", etc. It's safe to assume the
    format of the name is "First Last" (e.g. "John Doe").
- `age`: The age of the student to search for (optional). Month and day are not required into consideration of age.
    For example, if the age is 20, it should return all students who are 20 years old.
- `gender`: The gender of the student to search for (optional).

Successful response should return a list of students that match the criteria in the following format of data

```json
{
  "total": 2,
  "students": [
    {
      "id": 1,
      "name": "John Doe",
      "dateOfBirth": "1990-01-15",
      "enrollmentType": "FULL_TIME",
      "startTime": "2025-03-01T09:00:00Z"
    }
  ]
}
```

An API skeleton has already be created can be run using command:

```
./gradlew bootRun
```

Open the browser and visit: "<http://localhost:8080/students>"

