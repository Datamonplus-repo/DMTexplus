package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mensajeconfirmarrepuestocompatible", "/app.mensajeconfirmarrepuestocompatible"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mensajeconfirmarrepuestocompatible extends GXWebObjectStub
{
   public mensajeconfirmarrepuestocompatible( )
   {
   }

   public mensajeconfirmarrepuestocompatible( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mensajeconfirmarrepuestocompatible.class ));
   }

   public mensajeconfirmarrepuestocompatible( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mensajeconfirmarrepuestocompatible_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mensajeconfirmarrepuestocompatible_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mensaje Confirmar Repuesto Compatible";
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

