package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.wtipcau", "/app.ficherosbasicos.wtipcau"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wtipcau extends GXWebObjectStub
{
   public wtipcau( )
   {
   }

   public wtipcau( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wtipcau.class ));
   }

   public wtipcau( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wtipcau_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wtipcau_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipo Causas";
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

