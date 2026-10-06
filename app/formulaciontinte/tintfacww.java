package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacww", "/app.formulaciontinte.tintfacww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacww extends GXWebObjectStub
{
   public tintfacww( )
   {
   }

   public tintfacww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacww.class ));
   }

   public tintfacww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Intensidad Facturacion / Plannificacion";
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

