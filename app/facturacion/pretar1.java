package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.pretar1", "/app.facturacion.pretar1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pretar1 extends GXWebObjectStub
{
   public pretar1( )
   {
   }

   public pretar1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pretar1.class ));
   }

   public pretar1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pretar1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pretar1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de recalculo de precios";
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

