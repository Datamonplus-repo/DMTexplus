package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtip_wp", "/app.ficherosbasicos.tgrdtip_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtip_wp extends GXWebObjectStub
{
   public tgrdtip_wp( )
   {
   }

   public tgrdtip_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtip_wp.class ));
   }

   public tgrdtip_wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtip_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtip_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Classe (Gran Familia T. Artigo)";
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

