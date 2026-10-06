package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.upq_cuentacorriente_wc", "/app.stocksquimicos.upq_cuentacorriente_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class upq_cuentacorriente_wc extends GXWebObjectStub
{
   public upq_cuentacorriente_wc( )
   {
   }

   public upq_cuentacorriente_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( upq_cuentacorriente_wc.class ));
   }

   public upq_cuentacorriente_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new upq_cuentacorriente_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new upq_cuentacorriente_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UPQ_Cuenta Corriente";
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

