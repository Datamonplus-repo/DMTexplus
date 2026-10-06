package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0004", "/app.facturacion.rfa0004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0004 extends GXWebObjectStub
{
   public rfa0004( )
   {
   }

   public rfa0004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0004.class ));
   }

   public rfa0004( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC FACTURACION P/SERIE";
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

