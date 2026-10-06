package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttippreww", "/app.ficherosbasicos.ttippreww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttippreww extends GXWebObjectStub
{
   public ttippreww( )
   {
   }

   public ttippreww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttippreww.class ));
   }

   public ttippreww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttippreww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttippreww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipos de Presentacion";
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

