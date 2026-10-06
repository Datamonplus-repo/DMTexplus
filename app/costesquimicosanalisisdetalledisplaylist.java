package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesquimicosanalisisdetalledisplaylist", "/app.costesquimicosanalisisdetalledisplaylist"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesquimicosanalisisdetalledisplaylist extends GXWebObjectStub
{
   public costesquimicosanalisisdetalledisplaylist( )
   {
   }

   public costesquimicosanalisisdetalledisplaylist( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesquimicosanalisisdetalledisplaylist.class ));
   }

   public costesquimicosanalisisdetalledisplaylist( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesquimicosanalisisdetalledisplaylist_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesquimicosanalisisdetalledisplaylist_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Quimicos Analisis Detalle Display List";
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

