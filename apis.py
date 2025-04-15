import requests
 
# Replace with your actual API key and Search Engine ID
API_KEY = 'Enter your Api Key'
SEARCH_ENGINE_ID = 'Enter your Engine ID'
 
search_query = 'ismail yusuf college'
 
url = 'https://www.googleapis.com/customsearch/v1'
 
params = {
    'q': search_query,
    'key': API_KEY,
    'cx': SEARCH_ENGINE_ID
}
 
# Send request to the API
response = requests.get(url, params=params)
 
# Get the response data in JSON format
results = response.json()
 
# Check if there are results and print the first result's link
if 'items' in results:
    print(results['items'][0]['link'])
else:
    print("No results found.")
