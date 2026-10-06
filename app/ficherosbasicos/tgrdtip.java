package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtip", "/app.ficherosbasicos.tgrdtip"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtip extends GXWebObjectStub
{
   public tgrdtip( )
   {
   }

   public tgrdtip( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtip.class ));
   }

   public tgrdtip( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtip_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtip_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Classe (Gran Familia T. Artigo)";
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

