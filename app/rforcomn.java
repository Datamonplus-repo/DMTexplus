package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rforcomn", "/app.rforcomn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rforcomn extends GXWebObjectStub
{
   public rforcomn( )
   {
   }

   public rforcomn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rforcomn.class ));
   }

   public rforcomn( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rforcomn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rforcomn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMPRAS N PROVEEDORES";
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

