package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmpreveequiposwc", "/app.mantenimientomaquina.tmpreveequiposwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreveequiposwc extends GXWebObjectStub
{
   public tmpreveequiposwc( )
   {
   }

   public tmpreveequiposwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreveequiposwc.class ));
   }

   public tmpreveequiposwc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreveequiposwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreveequiposwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve Equipos WC";
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

