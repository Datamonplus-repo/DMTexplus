package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rprdt10", "/app.rprdt10"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rprdt10 extends GXWebObjectStub
{
   public rprdt10( )
   {
   }

   public rprdt10( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rprdt10.class ));
   }

   public rprdt10( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rprdt10_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rprdt10_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCCION TINTE DT";
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

