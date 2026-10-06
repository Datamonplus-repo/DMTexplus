package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttiaes", "/app.ttiaes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttiaes extends GXWebObjectStub
{
   public ttiaes( )
   {
   }

   public ttiaes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttiaes.class ));
   }

   public ttiaes( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttiaes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttiaes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TBV_PRODUCCION_TIAES";
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

