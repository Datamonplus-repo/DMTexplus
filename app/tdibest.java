package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdibest", "/app.tdibest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdibest extends GXWebObjectStub
{
   public tdibest( )
   {
   }

   public tdibest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdibest.class ));
   }

   public tdibest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdibest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdibest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESTADISTICAS DE DIBUJOS";
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

