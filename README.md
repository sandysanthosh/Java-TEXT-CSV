## Write Java pojos to Text File:



              PrintWriter pw = new PrintWriter("F:\\starwalt\\ava aspose jars\\text.txt");  //to write in text

              PrintWriter pw = new PrintWriter("F:\\starwalt\\ava aspose jars\\text.csv");   // to write in csv

              StringBuilder csvcontact = new StringBuilder();

              csvcontact.append("so");
              csvcontact.append("bookname");
              csvcontact.append("category");
              csvcontact.append("\r\n");


              csvcontact.append("1");
              csvcontact.append("bookname 1");
              csvcontact.append("sandy");
              csvcontact.append("\r\n");


              csvcontact.append("2");
              csvcontact.append("bookname 2");
              csvcontact.append("sandy");
              csvcontact.append("\r\n");

              csvcontact.append("3");
              csvcontact.append("bookname 3");
              csvcontact.append("kumar");
              csvcontact.append("\r\n");

              pw.write(csvcontact.toString());
              pw.close();
              
### TO DO in FORMAT:

csvFile - word - PDF- word - PPT:

                location
                filename
                csvcontent - stringbuilder


