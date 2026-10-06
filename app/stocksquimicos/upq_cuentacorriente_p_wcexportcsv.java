package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.upq_cuentacorriente_p_wcexportcsv", "/app.stocksquimicos.upq_cuentacorriente_p_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class upq_cuentacorriente_p_wcexportcsv extends GXWebObjectStub
{
   public upq_cuentacorriente_p_wcexportcsv( )
   {
   }

   public upq_cuentacorriente_p_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( upq_cuentacorriente_p_wcexportcsv.class ));
   }

   public upq_cuentacorriente_p_wcexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new upq_cuentacorriente_p_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new upq_cuentacorriente_p_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UPQ_Cuenta Corriente_p_WCExport CSV";
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

