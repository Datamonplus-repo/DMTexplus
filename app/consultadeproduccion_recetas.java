package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_recetas", "/app.consultadeproduccion_recetas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_recetas extends GXWebObjectStub
{
   public consultadeproduccion_recetas( )
   {
   }

   public consultadeproduccion_recetas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_recetas.class ));
   }

   public consultadeproduccion_recetas( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_recetas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_recetas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas";
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

