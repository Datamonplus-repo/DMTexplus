package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.lector__ww", "/app.lectoroptico.lector__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lector__ww extends GXWebObjectStub
{
   public lector__ww( )
   {
   }

   public lector__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lector__ww.class ));
   }

   public lector__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lector__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lector__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Tabla LECTOR";
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

