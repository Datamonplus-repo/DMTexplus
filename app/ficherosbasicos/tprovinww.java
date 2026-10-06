package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprovinww", "/app.ficherosbasicos.tprovinww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprovinww extends GXWebObjectStub
{
   public tprovinww( )
   {
   }

   public tprovinww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprovinww.class ));
   }

   public tprovinww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprovinww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprovinww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MANTENIMIENTO DE PROVINCIAS";
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

