package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.abonoscargosww", "/app.facturacion.abonoscargosww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abonoscargosww extends GXWebObjectStub
{
   public abonoscargosww( )
   {
   }

   public abonoscargosww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abonoscargosww.class ));
   }

   public abonoscargosww( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abonoscargosww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abonoscargosww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Abonos / Cargos";
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

