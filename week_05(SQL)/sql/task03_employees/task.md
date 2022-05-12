# Task - Employee Records

The major corporation BusinessCorp&#8482; wants to do some analysis of varioius metrics around its employees and have contracted the job out to you. They have provided you with two SQL files, you will need to write the queries which will extract the data they are looking for.

## Setup

- Create a database to run the files against
- Use the `psql -d database -f file` command to run the SQL files
- Before starting to write the queries take some time to look at the data and figure out the relationships between the tables - maybe even draw an ERD to help.

## Tasks

### CTEs

1) Calculate the average salary of all employees

```sql
SELECT
AVG(employees.salary)
FROM employees;

```



2) Calculate the average salary of the employees in each team (hint: you'll need to `JOIN` and `GROUP BY` here)

```sql
SELECT
employees.department_id,
AVG(employees.salary)
FROM 
employees
INNER JOIN 
departments ON department_id = departments.id
GROUP BY employees.department_id
ORDER BY avg DESC
```

3) Using a CTE find the ratio of each employees salary to their team average, eg. an employee earning £55000 in a team where the average is £50000 has a ratio of 1.1

```sql
WITH team_average_salary (id, average_salary) AS(
SELECT
employees.department_id AS id,
AVG(employees.salary) AS average_salary
FROM 
employees
INNER JOIN 
departments ON department_id = departments.id
GROUP BY employees.department_id
)
SELECT
e.department_id AS department_id,
t.average_salary AS average_department_salary,
e.salary,
e.salary / t.average_salary:: FLOAT AS salary_ratio
FROM
team_average_salary AS t

INNER JOIN employees AS e
ON e.department_id = t.id
ORDER BY salary_ratio ASC;
```

4) Find the employee with the highest ratio in Argentina

```sql
WITH team_average_salary (id, average_salary) AS(
SELECT
employees.department_id AS id,
AVG(employees.salary) AS average_salary
FROM 
employees
INNER JOIN 
departments ON department_id = departments.id
GROUP BY employees.department_id
)
SELECT
e.department_id AS department_id,
t.average_salary AS average_department_salary,
e.salary,
e.salary / t.average_salary:: FLOAT AS salary_ratio
FROM
team_average_salary AS t

INNER JOIN employees AS e
ON e.department_id = t.id
WHERE 
e.country = 'Argentina'
ORDER BY salary_ratio DESC LIMIT 1;
```

5) **Extension:** Add a second CTE calculating the average salary for each country and add a column showing the difference between each employee's salary and their country average

```sql
WITH team_average_salary (id, average_salary) AS(
SELECT
employees.department_id AS id,
AVG(employees.salary) AS average_salary
FROM 
employees
INNER JOIN 
departments ON department_id = departments.id
GROUP BY employees.department_id
), country_average (country, country_average) AS(

SELECT

employees.country AS country,
AVG(employees.salary) AS country_average
FROM employees
GROUP BY country
)
SELECT
c.country,
e.id AS employee_id,
e.salary AS employee_salary,
c.country_average,
e.salary / team_average_salary.average_salary:: FLOAT AS salary_ratio
abs(e.salary - c.country_average):: FLOAT AS difference

FROM
country_average AS c
INNER JOIN team_average_salary
ON employees.department_id = team_average_salary.id

INNER JOIN employees AS e
ON e.country = c.country
ORDER BY c.country
```


---

### Window Functions

1) Find the running total of salary costs as the business has grown and hired more people

```sql
<!--Copy solution here-->
```

2) Determine if any employees started on the same day (hint: some sort of ranking may be useful here)

```sql
<!--Copy solution here-->
```

3) Find how many employees there are from each country

```sql
<!--Copy solution here-->
```

4) Show how the average salary cost for each department has changed as the number of employees has increased

```sql
<!--Copy solution here-->
```

5) **Extension:** Research the `EXTRACT` function and use it in conjunction with `PARTITION` and `COUNT` to show how many employees started working for BusinessCorp&#8482; each year. If you're feeling adventurous you could further partition by month...

```sql
<!--Copy solution here-->
```

---

### Combining the two

1) Find the maximum and minimum salaries

```sql
<!--Copy solution here-->
```

2) Find the difference between the maximum and minimum salaries and each employee's own salary

```sql
<!--Copy solution here-->
```

3) Order the employees by start date. Research how to calculate the **median** salary value and the **standard deviation** in salary values and show how these change as more employees join the company

```sql
<!--Copy solution here-->
```

4) Limit this query to only Research & Development team members and show a rolling value for only the 5 most recent employees.

```sql
<!--Copy solution here-->
```

