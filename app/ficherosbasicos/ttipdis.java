package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdis", "/app.ficherosbasicos.ttipdis"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdis extends GXWebObjectStub
{
   public ttipdis( )
   {
   }

   public ttipdis( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdis.class ));
   }

   public ttipdis( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdis_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdis_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo de Disposicion";
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

