package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqnp1", "/app.tmaqnp1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqnp1 extends GXWebObjectStub
{
   public tmaqnp1( )
   {
   }

   public tmaqnp1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqnp1.class ));
   }

   public tmaqnp1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqnp1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqnp1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calendario Maquinas Tiempo NO planificado";
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

