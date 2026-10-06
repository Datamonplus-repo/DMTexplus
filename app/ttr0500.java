package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr0500", "/app.ttr0500"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0500 extends GXWebObjectStub
{
   public ttr0500( )
   {
   }

   public ttr0500( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0500.class ));
   }

   public ttr0500( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0500_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0500_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCCION DIARIA TOSA";
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

