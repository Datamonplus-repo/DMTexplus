package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttranspgeneral", "/app.ficherosbasicos.ttranspgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttranspgeneral extends GXWebObjectStub
{
   public ttranspgeneral( )
   {
   }

   public ttranspgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttranspgeneral.class ));
   }

   public ttranspgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttranspgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttranspgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTRANSPGeneral";
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

