package app.produccionactualizacionhistoricohdr ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionactualizacionhistoricohdr.actualizacionhistoricohdrww", "/app.produccionactualizacionhistoricohdr.actualizacionhistoricohdrww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class actualizacionhistoricohdrww extends GXWebObjectStub
{
   public actualizacionhistoricohdrww( )
   {
   }

   public actualizacionhistoricohdrww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( actualizacionhistoricohdrww.class ));
   }

   public actualizacionhistoricohdrww( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new actualizacionhistoricohdrww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new actualizacionhistoricohdrww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Actualización Historico HDR";
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

