package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipuniprompt", "/app.stocksquimicos.ttipuniprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipuniprompt extends GXWebObjectStub
{
   public ttipuniprompt( )
   {
   }

   public ttipuniprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipuniprompt.class ));
   }

   public ttipuniprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipuniprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipuniprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TIPOS DE UNIDADES";
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

