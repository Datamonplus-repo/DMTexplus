package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrnproces", "/app.ttrnproces"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrnproces extends GXWebObjectStub
{
   public ttrnproces( )
   {
   }

   public ttrnproces( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrnproces.class ));
   }

   public ttrnproces( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrnproces_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrnproces_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS";
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

