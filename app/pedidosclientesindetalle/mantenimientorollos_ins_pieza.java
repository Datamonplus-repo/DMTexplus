package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.mantenimientorollos_ins_pieza", "/app.pedidosclientesindetalle.mantenimientorollos_ins_pieza"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientorollos_ins_pieza extends GXWebObjectStub
{
   public mantenimientorollos_ins_pieza( )
   {
   }

   public mantenimientorollos_ins_pieza( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientorollos_ins_pieza.class ));
   }

   public mantenimientorollos_ins_pieza( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientorollos_ins_pieza_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientorollos_ins_pieza_impl(context).cleanup();
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

