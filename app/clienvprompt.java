package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.clienvprompt", "/app.clienvprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class clienvprompt extends GXWebObjectStub
{
   public clienvprompt( )
   {
   }

   public clienvprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( clienvprompt.class ));
   }

   public clienvprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new clienvprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new clienvprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tabla CLIENV";
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

