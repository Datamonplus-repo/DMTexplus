package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0005", "/app.facturacion.rfa0005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0005 extends GXWebObjectStub
{
   public rfa0005( )
   {
   }

   public rfa0005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0005.class ));
   }

   public rfa0005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC FACTURACION P/CLIENTE";
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

