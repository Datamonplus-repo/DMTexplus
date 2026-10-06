package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.diferenciasrecuentos_wcexportcsv", "/app.diferenciasrecuentos_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class diferenciasrecuentos_wcexportcsv extends GXWebObjectStub
{
   public diferenciasrecuentos_wcexportcsv( )
   {
   }

   public diferenciasrecuentos_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( diferenciasrecuentos_wcexportcsv.class ));
   }

   public diferenciasrecuentos_wcexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new diferenciasrecuentos_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new diferenciasrecuentos_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Diferencias Recuentos_WCExport CSV";
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

