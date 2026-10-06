package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tmarcomww", "/app.facturacion.tmarcomww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcomww extends GXWebObjectStub
{
   public tmarcomww( )
   {
   }

   public tmarcomww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcomww.class ));
   }

   public tmarcomww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcomww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcomww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Margem Comercialiçao";
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

