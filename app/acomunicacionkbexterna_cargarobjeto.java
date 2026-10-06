package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.acomunicacionkbexterna_cargarobjeto", "/app.acomunicacionkbexterna_cargarobjeto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class acomunicacionkbexterna_cargarobjeto extends GXWebObjectStub
{
   public acomunicacionkbexterna_cargarobjeto( )
   {
   }

   public acomunicacionkbexterna_cargarobjeto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( acomunicacionkbexterna_cargarobjeto.class ));
   }

   public acomunicacionkbexterna_cargarobjeto( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new acomunicacionkbexterna_cargarobjeto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new acomunicacionkbexterna_cargarobjeto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Comunicacion Kb Externa_Cargar Objeto";
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

