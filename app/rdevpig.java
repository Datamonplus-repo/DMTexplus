package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevpig", "/app.rdevpig"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevpig extends GXWebObjectStub
{
   public rdevpig( )
   {
   }

   public rdevpig( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevpig.class ));
   }

   public rdevpig( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevpig_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevpig_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARAN DEVOLUCION PIEZAS Graf";
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

