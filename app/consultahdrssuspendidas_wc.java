package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultahdrssuspendidas_wc", "/app.consultahdrssuspendidas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultahdrssuspendidas_wc extends GXWebObjectStub
{
   public consultahdrssuspendidas_wc( )
   {
   }

   public consultahdrssuspendidas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultahdrssuspendidas_wc.class ));
   }

   public consultahdrssuspendidas_wc( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultahdrssuspendidas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultahdrssuspendidas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Hdrs Suspendidas ";
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

