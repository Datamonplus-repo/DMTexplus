package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.seleccionsubequipos", "/app.mantenimientomaquina.seleccionsubequipos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionsubequipos extends GXWebObjectStub
{
   public seleccionsubequipos( )
   {
   }

   public seleccionsubequipos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionsubequipos.class ));
   }

   public seleccionsubequipos( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionsubequipos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionsubequipos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Sub Equipos";
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

