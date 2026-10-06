package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.rmod008_consultaexportcsv", "/app.pedidosclientesindetalle.rmod008_consultaexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod008_consultaexportcsv extends GXWebObjectStub
{
   public rmod008_consultaexportcsv( )
   {
   }

   public rmod008_consultaexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod008_consultaexportcsv.class ));
   }

   public rmod008_consultaexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod008_consultaexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod008_consultaexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RMOD008_Consulta Export CSV";
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

