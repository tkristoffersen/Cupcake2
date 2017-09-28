/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Bottom;
import java.util.List;

/**
 *
 * @author tobbe
 */
public class RendUtilBottom {
    
public static String bottomTable(List<Bottom> boot) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n"
                + "<tr><th>Bottom</th><th>Pris</th><th></th><th></th></tr>\n");
        for (Bottom b : boot) {
            sb.append("<tr><form action=\"index.jsp\">");
            sb.append("<td>").append(b.getName()).append("</td>");
            sb.append("<td>").append(b.getPrice()).append("</td>");
            sb.append("<td> \n <input type=\"checkbox\" name=\"botname\" value=\"" + b.getName() + "\"><br>\n\n</td>");
            // sb.append("<td> \n <button type=\"button\" onclick=\"location.href = \'index.jsp';");
        }
        sb.append("</table>\n");
        return sb.toString();

    }

}
