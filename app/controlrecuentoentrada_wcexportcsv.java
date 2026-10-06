package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlrecuentoentrada_wcexportcsv", "/app.controlrecuentoentrada_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlrecuentoentrada_wcexportcsv extends GXWebObjectStub
{
   public controlrecuentoentrada_wcexportcsv( )
   {
   }

   public controlrecuentoentrada_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlrecuentoentrada_wcexportcsv.class ));
   }

   public controlrecuentoentrada_wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlrecuentoentrada_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlrecuentoentrada_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Recuento Entrada_WCExport CSV";
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

