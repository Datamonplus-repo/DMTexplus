package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.web_consultarepuestostockminimo", "/app.mantenimientomaquina.web_consultarepuestostockminimo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class web_consultarepuestostockminimo extends GXWebObjectStub
{
   public web_consultarepuestostockminimo( )
   {
   }

   public web_consultarepuestostockminimo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( web_consultarepuestostockminimo.class ));
   }

   public web_consultarepuestostockminimo( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new web_consultarepuestostockminimo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new web_consultarepuestostockminimo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Repuesto Stock Minimo";
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

