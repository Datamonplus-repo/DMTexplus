package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rfa0003", "/app.facturacion.rfa0003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rfa0003 extends GXWebObjectStub
{
   public rfa0003( )
   {
   }

   public rfa0003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rfa0003.class ));
   }

   public rfa0003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rfa0003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rfa0003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Facturacion por Fases";
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

