package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtip_cabecera", "/app.ficherosbasicos.tgrdtip_cabecera"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtip_cabecera extends GXWebObjectStub
{
   public tgrdtip_cabecera( )
   {
   }

   public tgrdtip_cabecera( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtip_cabecera.class ));
   }

   public tgrdtip_cabecera( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtip_cabecera_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtip_cabecera_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Gran Familia Articulo";
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

