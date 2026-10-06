package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.lmetpi", "/app.expedicionesautomatizadas.lmetpi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lmetpi extends GXWebObjectStub
{
   public lmetpi( )
   {
   }

   public lmetpi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lmetpi.class ));
   }

   public lmetpi( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lmetpi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lmetpi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LMETPI";
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

