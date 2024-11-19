Test the Application:
You can test the application using a tool like Postman or curl by sending a POST request to the /api/barcode/decode endpoint with a file containing a barcode image.

For example, using curl:

curl -F "file=@/path/to/barcode.png" http://localhost:8080/api/barcode/decode
This will return the decoded text from the barcode image.

Test Command1: curl -F "file=@/Users{XYZ}/<FILE-PATH>/bar_code_read.png" http://localhost:8080/api/barcode/decode
Sample test command: curl -F "file=@/Users/user1/Downloads/bar_code_read.png" http://localhost:8080/api/barcode/decode

