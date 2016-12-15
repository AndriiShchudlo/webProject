package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


@WebServlet("/")
public class FolderStructure extends HttpServlet {

    private static List<String> listWithFileNames;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getListFiles("/home/andriis");

        request.setAttribute("datas", listWithFileNames);
        request.getRequestDispatcher("home.jsp").forward(request,response);


    }



    public static void getListFiles(String str) {
        listWithFileNames = new ArrayList<String>();
        File f = new File(str);

        for (File s : f.listFiles()) {
            listWithFileNames.add(s.getName());
        }

    }
}
