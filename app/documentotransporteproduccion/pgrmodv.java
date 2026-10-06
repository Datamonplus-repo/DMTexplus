package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.pgrmodv", "/app.documentotransporteproduccion.pgrmodv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pgrmodv extends GXWebObjectStub
{
   public pgrmodv( )
   {
   }

   public pgrmodv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pgrmodv.class ));
   }

   public pgrmodv( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pgrmodv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pgrmodv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia de Remessa Valorada";
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

