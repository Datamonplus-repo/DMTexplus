package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0009", "/app.facturacion.rfa0009"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0009 extends GXWebObjectStub
{
   public rfa0009( )
   {
   }

   public rfa0009( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0009.class ));
   }

   public rfa0009( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0009_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0009_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FACTURACION P/SERIE MES";
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

