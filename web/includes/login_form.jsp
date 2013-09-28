<h3>
    <img src="images/key.png" height="25rem" width="25rem" align="left"/>
    Authenticity CheckPoint
</h3>
<div class="login_form_content">
    <form name="login_form" method="post" action="login">
        <div class="error">
            <%
               if(session.getAttribute("invalid-log-in-attempt")!=null)
                out.println(session.getAttribute("invalid-log-in-attempt"));
                session.setAttribute("invalid-log-in-attempt",null);
             %>
        </div>
        <table>
            <tr><td align="right">ID</td>
                <td><input class="input" type="text" name="id" size="25" 
                           onFocus="if(this.value==this.defaultValue)this.value='';" value="User Name"
                           onblur="if(this.value=='')this.value=this.defaultValue;"/></td></tr>
            <tr><td align="right">Password</td>
                <td><input class="input" type="text" name="pass" size="25"
                           onFocus="if(this.value==this.defaultValue)this.value='';this.type='password';" value="Password"
                           onblur="if(this.value=='')this.value=this.defaultValue;this.type='text';"/>
                </td></tr>
            <tr><td colspan="2" align="center"><input type="submit" value="Log In" />
                    <input type="reset" value="Clear"/></td></tr>
        </table>
    </form>
</div>
	

