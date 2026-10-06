package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.wc_defectos_modificar", "/app.expedicionesautomatizadas.wc_defectos_modificar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_defectos_modificar extends GXWebObjectStub
{
   public wc_defectos_modificar( )
   {
   }

   public wc_defectos_modificar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_defectos_modificar.class ));
   }

   public wc_defectos_modificar( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_defectos_modificar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_defectos_modificar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_Defectos_Modificar";
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

