package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tdivisaprompt", "/app.ficherosbasicos.tdivisaprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdivisaprompt extends GXWebObjectStub
{
   public tdivisaprompt( )
   {
   }

   public tdivisaprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdivisaprompt.class ));
   }

   public tdivisaprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdivisaprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdivisaprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona DIVISAS";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

