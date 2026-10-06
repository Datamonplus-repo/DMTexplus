package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tmetpedww", "/app.stocksquimicos.tmetpedww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpedww extends GXWebObjectStub
{
   public tmetpedww( )
   {
   }

   public tmetpedww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpedww.class ));
   }

   public tmetpedww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpedww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpedww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " METODO PEDIDO DEL PRODUCTO";
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

