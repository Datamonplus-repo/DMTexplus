package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.generacionhdrs_wc", "/app.pedidos.generacionhdrs_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generacionhdrs_wc extends GXWebObjectStub
{
   public generacionhdrs_wc( )
   {
   }

   public generacionhdrs_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generacionhdrs_wc.class ));
   }

   public generacionhdrs_wc( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generacionhdrs_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generacionhdrs_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Generacion HDRs";
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

