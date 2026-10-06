package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobsfra", "/app.tobsfra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsfra extends GXWebObjectStub
{
   public tobsfra( )
   {
   }

   public tobsfra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsfra.class ));
   }

   public tobsfra( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsfra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsfra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES FACTURA";
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

