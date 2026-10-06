package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta__wwexportcsv", "/app.pedidosclientesindetalle.hojaderuta__wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta__wwexportcsv extends GXWebObjectStub
{
   public hojaderuta__wwexportcsv( )
   {
   }

   public hojaderuta__wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta__wwexportcsv.class ));
   }

   public hojaderuta__wwexportcsv( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta__wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta__wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hojade Ruta__WWExport CSV";
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

