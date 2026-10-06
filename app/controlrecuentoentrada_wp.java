package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlrecuentoentrada_wp", "/app.controlrecuentoentrada_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlrecuentoentrada_wp extends GXWebObjectStub
{
   public controlrecuentoentrada_wp( )
   {
   }

   public controlrecuentoentrada_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlrecuentoentrada_wp.class ));
   }

   public controlrecuentoentrada_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlrecuentoentrada_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlrecuentoentrada_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Recuento Entrada ";
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

