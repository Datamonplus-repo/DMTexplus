package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlrecuentoentrada_wc", "/app.controlrecuentoentrada_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlrecuentoentrada_wc extends GXWebObjectStub
{
   public controlrecuentoentrada_wc( )
   {
   }

   public controlrecuentoentrada_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlrecuentoentrada_wc.class ));
   }

   public controlrecuentoentrada_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlrecuentoentrada_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlrecuentoentrada_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Recuento, Entrada ";
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

