package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr0700", "/app.ttr0700"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0700 extends GXWebObjectStub
{
   public ttr0700( )
   {
   }

   public ttr0700( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0700.class ));
   }

   public ttr0700( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0700_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0700_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLASIFICACION ARTICULOS";
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

