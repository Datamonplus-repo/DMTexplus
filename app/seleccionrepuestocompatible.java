package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.seleccionrepuestocompatible", "/app.seleccionrepuestocompatible"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionrepuestocompatible extends GXWebObjectStub
{
   public seleccionrepuestocompatible( )
   {
   }

   public seleccionrepuestocompatible( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionrepuestocompatible.class ));
   }

   public seleccionrepuestocompatible( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionrepuestocompatible_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionrepuestocompatible_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Repuesto Compatible";
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

