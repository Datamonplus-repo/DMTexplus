package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproprv", "/app.tproprv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproprv extends GXWebObjectStub
{
   public tproprv( )
   {
   }

   public tproprv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproprv.class ));
   }

   public tproprv( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproprv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproprv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCTO CON n PROVEEDORES";
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

