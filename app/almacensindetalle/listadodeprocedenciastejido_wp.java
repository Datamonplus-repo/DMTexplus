package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.listadodeprocedenciastejido_wp", "/app.almacensindetalle.listadodeprocedenciastejido_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprocedenciastejido_wp extends GXWebObjectStub
{
   public listadodeprocedenciastejido_wp( )
   {
   }

   public listadodeprocedenciastejido_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprocedenciastejido_wp.class ));
   }

   public listadodeprocedenciastejido_wp( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprocedenciastejido_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprocedenciastejido_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Procedencias Tejido";
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

