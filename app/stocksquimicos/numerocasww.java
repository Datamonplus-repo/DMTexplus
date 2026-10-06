package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.numerocasww", "/app.stocksquimicos.numerocasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerocasww extends GXWebObjectStub
{
   public numerocasww( )
   {
   }

   public numerocasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerocasww.class ));
   }

   public numerocasww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerocasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerocasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Numero Cas";
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

