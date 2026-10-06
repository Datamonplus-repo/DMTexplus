package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporfaseww", "/app.produccion.cargasproduccionporfaseww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporfaseww extends GXWebObjectStub
{
   public cargasproduccionporfaseww( )
   {
   }

   public cargasproduccionporfaseww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporfaseww.class ));
   }

   public cargasproduccionporfaseww( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporfaseww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporfaseww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cargas por Fase";
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

