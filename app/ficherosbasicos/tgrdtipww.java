package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtipww", "/app.ficherosbasicos.tgrdtipww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtipww extends GXWebObjectStub
{
   public tgrdtipww( )
   {
   }

   public tgrdtipww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtipww.class ));
   }

   public tgrdtipww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtipww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtipww_impl(context).cleanup();
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

