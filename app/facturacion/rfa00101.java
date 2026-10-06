package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa00101", "/app.facturacion.rfa00101"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa00101 extends GXWebObjectStub
{
   public rfa00101( )
   {
   }

   public rfa00101( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa00101.class ));
   }

   public rfa00101( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa00101_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa00101_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FACTURADO ANUAL POR IMPORTE";
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

