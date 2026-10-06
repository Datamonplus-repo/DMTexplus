package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprd", "/app.tnprovprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprd extends GXWebObjectStub
{
   public tnprovprd( )
   {
   }

   public tnprovprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprd.class ));
   }

   public tnprovprd( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "n Proveedores 1 Producto";
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

