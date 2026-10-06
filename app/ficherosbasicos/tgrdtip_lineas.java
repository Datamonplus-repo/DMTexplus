package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtip_lineas", "/app.ficherosbasicos.tgrdtip_lineas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtip_lineas extends GXWebObjectStub
{
   public tgrdtip_lineas( )
   {
   }

   public tgrdtip_lineas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtip_lineas.class ));
   }

   public tgrdtip_lineas( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtip_lineas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtip_lineas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lineas ( Gran Familia)";
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

