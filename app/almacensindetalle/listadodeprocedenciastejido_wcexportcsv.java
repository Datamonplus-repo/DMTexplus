package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.listadodeprocedenciastejido_wcexportcsv", "/app.almacensindetalle.listadodeprocedenciastejido_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeprocedenciastejido_wcexportcsv extends GXWebObjectStub
{
   public listadodeprocedenciastejido_wcexportcsv( )
   {
   }

   public listadodeprocedenciastejido_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeprocedenciastejido_wcexportcsv.class ));
   }

   public listadodeprocedenciastejido_wcexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeprocedenciastejido_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeprocedenciastejido_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Procedencias Tejido_WCExport CSV";
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

