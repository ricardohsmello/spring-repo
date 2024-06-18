# spring-repo
This is a repository to explore the Spring Framework.

## Example Chat Client API Request
You can use the following `curl` command to make a request to the API:

```sh
curl --location 'http://localhost:8080/question?message=Who_Won_The_World_Cup_2002?'

{
    "completion": "The 2002 FIFA World Cup was won by Brazil."
}
```
## Example Embedded Client API Request
You can use the following `curl` command to make a request to the API:

```sh
curl --location 'http://localhost:8080/embedding?message=I_Want_A_Movie_With_World_Cup!!'

{
    "embedding": [
        {
            "index": 0,
            "metadata": null,
            "output": [
                -0.01900272,
                5.8351824E-4,
                0.012789531,
                0.010709664,
                ....,
                ....
            ]
        }
    ]
}
