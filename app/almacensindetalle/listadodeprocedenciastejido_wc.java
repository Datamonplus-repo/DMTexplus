package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.listadodeprocedenciastejido_wc", "/app.almacensindetalle.listadodeprocedenciastejido_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprocedenciastejido_wc extends GXWebObjectStub
{
   public listadodeprocedenciastejido_wc( )
   {
   }

   public listadodeprocedenciastejido_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprocedenciastejido_wc.class ));
   }

   public listadodeprocedenciastejido_wc( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprocedenciastejido_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprocedenciastejido_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Procedencias de Tejido";
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

