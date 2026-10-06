package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipdtoww", "/app.stocksquimicos.ttipdtoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdtoww extends GXWebObjectStub
{
   public ttipdtoww( )
   {
   }

   public ttipdtoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdtoww.class ));
   }

   public ttipdtoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdtoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdtoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipo de Descuento";
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

