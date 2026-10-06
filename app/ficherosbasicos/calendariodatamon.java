package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.calendariodatamon", "/app.ficherosbasicos.calendariodatamon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calendariodatamon extends GXWebObjectStub
{
   public calendariodatamon( )
   {
   }

   public calendariodatamon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calendariodatamon.class ));
   }

   public calendariodatamon( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calendariodatamon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calendariodatamon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calendario Datamon";
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

