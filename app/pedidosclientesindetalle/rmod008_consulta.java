package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.rmod008_consulta", "/app.pedidosclientesindetalle.rmod008_consulta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod008_consulta extends GXWebObjectStub
{
   public rmod008_consulta( )
   {
   }

   public rmod008_consulta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod008_consulta.class ));
   }

   public rmod008_consulta( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod008_consulta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod008_consulta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Produccion en Curso";
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

