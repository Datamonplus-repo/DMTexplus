package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.inventarioat", "/app.stocksquimicos.inventarioat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class inventarioat extends GXWebObjectStub
{
   public inventarioat( )
   {
   }

   public inventarioat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( inventarioat.class ));
   }

   public inventarioat( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new inventarioat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new inventarioat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inventario AT";
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

