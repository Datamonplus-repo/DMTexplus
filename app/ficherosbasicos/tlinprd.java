package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tlinprd", "/app.ficherosbasicos.tlinprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinprd extends GXWebObjectStub
{
   public tlinprd( )
   {
   }

   public tlinprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinprd.class ));
   }

   public tlinprd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lineas de Produccion";
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

