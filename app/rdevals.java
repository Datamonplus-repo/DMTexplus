package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevals", "/app.rdevals"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevals extends GXWebObjectStub
{
   public rdevals( )
   {
   }

   public rdevals( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevals.class ));
   }

   public rdevals( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevals_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevals_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DEVOLUCION PROD.ALMACEN STD-GR";
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

