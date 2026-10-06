package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultahdrssuspendidas", "/app.consultahdrssuspendidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultahdrssuspendidas extends GXWebObjectStub
{
   public consultahdrssuspendidas( )
   {
   }

   public consultahdrssuspendidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultahdrssuspendidas.class ));
   }

   public consultahdrssuspendidas( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultahdrssuspendidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultahdrssuspendidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Hdrs Suspendidas";
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

