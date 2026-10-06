package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientorollospieza", "/app.mantenimientorollospieza"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollospieza extends GXWebObjectStub
{
   public mantenimientorollospieza( )
   {
   }

   public mantenimientorollospieza( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollospieza.class ));
   }

   public mantenimientorollospieza( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollospieza_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollospieza_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Fases de Produccion HDR";
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

