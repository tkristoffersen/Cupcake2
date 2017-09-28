/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Topping;
import java.util.List;

/**
 *
 * @author tobbe
 */
public class RendUtilTopping {
    
public static String toppingTable(List<Topping> topps) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n"
                + "<tr><th>Topping</th><th>Pris</th><th></th><th></th></tr>\n");
        for (Topping t : topps) {
            sb.append("<tr><form action=\"index.jsp\">");
            sb.append("<td>").append(t.getName()).append("</td>");
            sb.append("<td>").append(t.getPrice()).append("</td>");
            sb.append("<td> \n <input type=\"checkbox\" name=\"topname\" value=\"" + t.getName() + "\"><br>\n\n</td>");
            sb.append("</tr>\n");
        }
        sb.append("</table>\n");
        return sb.toString();

    }

}
