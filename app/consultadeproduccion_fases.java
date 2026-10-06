package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_fases", "/app.consultadeproduccion_fases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_fases extends GXWebObjectStub
{
   public consultadeproduccion_fases( )
   {
   }

   public consultadeproduccion_fases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_fases.class ));
   }

   public consultadeproduccion_fases( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_fases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_fases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Fases Produccion";
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

