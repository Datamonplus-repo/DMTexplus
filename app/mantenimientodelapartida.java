package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientodelapartida", "/app.mantenimientodelapartida"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantenimientodelapartida extends GXWebObjectStub
{
   public mantenimientodelapartida( )
   {
   }

   public mantenimientodelapartida( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantenimientodelapartida.class ));
   }

   public mantenimientodelapartida( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantenimientodelapartida_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantenimientodelapartida_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento HDRs";
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

