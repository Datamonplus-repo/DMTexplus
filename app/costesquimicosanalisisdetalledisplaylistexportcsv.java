package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesquimicosanalisisdetalledisplaylistexportcsv", "/app.costesquimicosanalisisdetalledisplaylistexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesquimicosanalisisdetalledisplaylistexportcsv extends GXWebObjectStub
{
   public costesquimicosanalisisdetalledisplaylistexportcsv( )
   {
   }

   public costesquimicosanalisisdetalledisplaylistexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesquimicosanalisisdetalledisplaylistexportcsv.class ));
   }

   public costesquimicosanalisisdetalledisplaylistexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesquimicosanalisisdetalledisplaylistexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesquimicosanalisisdetalledisplaylistexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Quimicos Analisis Detalle Display List Export CSV";
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

