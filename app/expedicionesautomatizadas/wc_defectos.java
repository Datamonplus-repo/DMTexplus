package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.wc_defectos", "/app.expedicionesautomatizadas.wc_defectos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_defectos extends GXWebObjectStub
{
   public wc_defectos( )
   {
   }

   public wc_defectos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_defectos.class ));
   }

   public wc_defectos( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_defectos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_defectos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_Defectos";
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

