package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadeproduccion_albaranesproduccion", "/app.consultadeproduccion_albaranesproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadeproduccion_albaranesproduccion extends GXWebObjectStub
{
   public consultadeproduccion_albaranesproduccion( )
   {
   }

   public consultadeproduccion_albaranesproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadeproduccion_albaranesproduccion.class ));
   }

   public consultadeproduccion_albaranesproduccion( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadeproduccion_albaranesproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadeproduccion_albaranesproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Albaran de Entrega";
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

