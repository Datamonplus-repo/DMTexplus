package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_fasesfull", "/app.consultadeproduccion_fasesfull"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_fasesfull extends GXWebObjectStub
{
   public consultadeproduccion_fasesfull( )
   {
   }

   public consultadeproduccion_fasesfull( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_fasesfull.class ));
   }

   public consultadeproduccion_fasesfull( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_fasesfull_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_fasesfull_impl(context).cleanup();
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

