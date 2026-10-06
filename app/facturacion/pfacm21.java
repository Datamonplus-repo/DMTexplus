package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.pfacm21", "/app.facturacion.pfacm21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pfacm21 extends GXWebObjectStub
{
   public pfacm21( )
   {
   }

   public pfacm21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pfacm21.class ));
   }

   public pfacm21( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pfacm21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pfacm21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fatura";
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

