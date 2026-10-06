package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0010", "/app.facturacion.rfa0010"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0010 extends GXWebObjectStub
{
   public rfa0010( )
   {
   }

   public rfa0010( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0010.class ));
   }

   public rfa0010( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0010_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0010_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FACTURACION ANUAL P/CLIENTE";
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

