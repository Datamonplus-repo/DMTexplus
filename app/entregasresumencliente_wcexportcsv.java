package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entregasresumencliente_wcexportcsv", "/app.entregasresumencliente_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entregasresumencliente_wcexportcsv extends GXWebObjectStub
{
   public entregasresumencliente_wcexportcsv( )
   {
   }

   public entregasresumencliente_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entregasresumencliente_wcexportcsv.class ));
   }

   public entregasresumencliente_wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entregasresumencliente_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entregasresumencliente_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entregas Resumen Cliente_WCExport CSV";
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

