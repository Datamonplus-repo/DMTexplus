package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttippre", "/app.ficherosbasicos.ttippre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttippre extends GXWebObjectStub
{
   public ttippre( )
   {
   }

   public ttippre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttippre.class ));
   }

   public ttippre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttippre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttippre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Presentacion";
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

