package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.upq_cuentacorriente_exportcsv", "/app.stocksquimicos.upq_cuentacorriente_exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class upq_cuentacorriente_exportcsv extends GXWebObjectStub
{
   public upq_cuentacorriente_exportcsv( )
   {
   }

   public upq_cuentacorriente_exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( upq_cuentacorriente_exportcsv.class ));
   }

   public upq_cuentacorriente_exportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new upq_cuentacorriente_exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new upq_cuentacorriente_exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UPQ_Cuenta Corriente CSV";
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

