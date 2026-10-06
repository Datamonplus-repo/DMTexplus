package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambiodenumerodeprogramaenensayos", "/app.formulaciontinte.cambiodenumerodeprogramaenensayos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodenumerodeprogramaenensayos extends GXWebObjectStub
{
   public cambiodenumerodeprogramaenensayos( )
   {
   }

   public cambiodenumerodeprogramaenensayos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodenumerodeprogramaenensayos.class ));
   }

   public cambiodenumerodeprogramaenensayos( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodenumerodeprogramaenensayos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodenumerodeprogramaenensayos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos de Laboratorio";
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

