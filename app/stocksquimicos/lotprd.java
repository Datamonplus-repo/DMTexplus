package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.lotprd", "/app.stocksquimicos.lotprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lotprd extends GXWebObjectStub
{
   public lotprd( )
   {
   }

   public lotprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lotprd.class ));
   }

   public lotprd( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lotprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lotprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lotes Producto";
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

