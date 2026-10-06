package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.documentodetransporteproduccion_14_pwdgrl", "/app.albaranes.documentodetransporteproduccion_14_pwdgrl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporteproduccion_14_pwdgrl extends GXWebObjectStub
{
   public documentodetransporteproduccion_14_pwdgrl( )
   {
   }

   public documentodetransporteproduccion_14_pwdgrl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporteproduccion_14_pwdgrl.class ));
   }

   public documentodetransporteproduccion_14_pwdgrl( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporteproduccion_14_pwdgrl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporteproduccion_14_pwdgrl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion de Precios (Password)";
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

