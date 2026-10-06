package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entregasresumencliente_wc", "/app.entregasresumencliente_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entregasresumencliente_wc extends GXWebObjectStub
{
   public entregasresumencliente_wc( )
   {
   }

   public entregasresumencliente_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entregasresumencliente_wc.class ));
   }

   public entregasresumencliente_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entregasresumencliente_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entregasresumencliente_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entregas Resumen de Cliente";
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

