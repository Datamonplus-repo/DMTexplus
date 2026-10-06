package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeoprompt", "/app.ficherosbasicos.tzongeoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeoprompt extends GXWebObjectStub
{
   public tzongeoprompt( )
   {
   }

   public tzongeoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeoprompt.class ));
   }

   public tzongeoprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Zonas Geograficas";
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

