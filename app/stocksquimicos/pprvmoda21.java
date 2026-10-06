package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.pprvmoda21", "/app.stocksquimicos.pprvmoda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pprvmoda21 extends GXWebObjectStub
{
   public pprvmoda21( )
   {
   }

   public pprvmoda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pprvmoda21.class ));
   }

   public pprvmoda21( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pprvmoda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pprvmoda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia fornecedor";
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

