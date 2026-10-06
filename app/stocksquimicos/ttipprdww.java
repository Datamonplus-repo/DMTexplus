package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprdww", "/app.stocksquimicos.ttipprdww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprdww extends GXWebObjectStub
{
   public ttipprdww( )
   {
   }

   public ttipprdww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprdww.class ));
   }

   public ttipprdww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprdww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprdww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TIPO DE PRODUCTO";
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

