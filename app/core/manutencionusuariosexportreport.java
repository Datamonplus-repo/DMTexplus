package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.manutencionusuariosexportreport", "/app.core.manutencionusuariosexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class manutencionusuariosexportreport extends GXWebObjectStub
{
   public manutencionusuariosexportreport( )
   {
   }

   public manutencionusuariosexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( manutencionusuariosexportreport.class ));
   }

   public manutencionusuariosexportreport( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new manutencionusuariosexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new manutencionusuariosexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Manutencion Usuarios Export Report";
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

