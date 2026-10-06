package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta_trnwwexportcsv", "/app.pedidosclientesindetalle.hojaderuta_trnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta_trnwwexportcsv extends GXWebObjectStub
{
   public hojaderuta_trnwwexportcsv( )
   {
   }

   public hojaderuta_trnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta_trnwwexportcsv.class ));
   }

   public hojaderuta_trnwwexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta_trnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta_trnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hojade Ruta_TRNWWExport CSV";
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

