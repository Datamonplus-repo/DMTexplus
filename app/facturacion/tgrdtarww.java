package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tgrdtarww", "/app.facturacion.tgrdtarww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtarww extends GXWebObjectStub
{
   public tgrdtarww( )
   {
   }

   public tgrdtarww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtarww.class ));
   }

   public tgrdtarww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtarww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtarww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Custos Gerals";
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

