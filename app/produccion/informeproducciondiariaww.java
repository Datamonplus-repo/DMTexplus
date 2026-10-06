package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.informeproducciondiariaww", "/app.produccion.informeproducciondiariaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informeproducciondiariaww extends GXWebObjectStub
{
   public informeproducciondiariaww( )
   {
   }

   public informeproducciondiariaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informeproducciondiariaww.class ));
   }

   public informeproducciondiariaww( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informeproducciondiariaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informeproducciondiariaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Producción Diaria";
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

