package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeo", "/app.ficherosbasicos.tzongeo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeo extends GXWebObjectStub
{
   public tzongeo( )
   {
   }

   public tzongeo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeo.class ));
   }

   public tzongeo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Zonas Geograficas";
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

