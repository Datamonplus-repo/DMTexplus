package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordenoperadorprompt", "/app.tmordenoperadorprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenoperadorprompt extends GXWebObjectStub
{
   public tmordenoperadorprompt( )
   {
   }

   public tmordenoperadorprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenoperadorprompt.class ));
   }

   public tmordenoperadorprompt( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenoperadorprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenoperadorprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Operador";
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

