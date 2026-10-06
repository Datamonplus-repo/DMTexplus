package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcprocesosquimicosexportcsv", "/app.wcprocesosquimicosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcprocesosquimicosexportcsv extends GXWebObjectStub
{
   public wcprocesosquimicosexportcsv( )
   {
   }

   public wcprocesosquimicosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcprocesosquimicosexportcsv.class ));
   }

   public wcprocesosquimicosexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcprocesosquimicosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcprocesosquimicosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProcesos Quimicos Export CSV";
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

