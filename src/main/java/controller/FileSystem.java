package controller;

import ViewPackage.FilesView;
import model.BackFolder;
import ViewPackage.BackGetter;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/")
public class FileSystem extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FormationFileList folderStructure = new FormationFileList();
        Validator validator = new Validator();
        String path = request.getParameter("path");
        path =  validator.isNull(path);

        BackFolder back = new BackFolder();
        BackGetter backGetter =  back.backFolder(path);

        List<FilesView> filesAndFolders = folderStructure.getListFilesAndFolders(path);

        request.setAttribute("datas", filesAndFolders);
        request.setAttribute("back", backGetter);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }
}

