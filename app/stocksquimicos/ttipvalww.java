package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipvalww", "/app.stocksquimicos.ttipvalww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipvalww extends GXWebObjectStub
{
   public ttipvalww( )
   {
   }

   public ttipvalww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipvalww.class ));
   }

   public ttipvalww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipvalww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipvalww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TIPO VALIDEZ  PRODUCTO";
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

