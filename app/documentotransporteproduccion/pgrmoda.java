package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.pgrmoda", "/app.documentotransporteproduccion.pgrmoda"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pgrmoda extends GXWebObjectStub
{
   public pgrmoda( )
   {
   }

   public pgrmoda( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pgrmoda.class ));
   }

   public pgrmoda( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pgrmoda_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pgrmoda_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia de Remessa";
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

