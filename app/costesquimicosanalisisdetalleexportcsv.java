package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesquimicosanalisisdetalleexportcsv", "/app.costesquimicosanalisisdetalleexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesquimicosanalisisdetalleexportcsv extends GXWebObjectStub
{
   public costesquimicosanalisisdetalleexportcsv( )
   {
   }

   public costesquimicosanalisisdetalleexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesquimicosanalisisdetalleexportcsv.class ));
   }

   public costesquimicosanalisisdetalleexportcsv( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesquimicosanalisisdetalleexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesquimicosanalisisdetalleexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Quimicos Analisis Detalle Export CSV";
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

