package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionresumenfasesqueryviewer", "/app.wcproduccionresumenfasesqueryviewer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionresumenfasesqueryviewer extends GXWebObjectStub
{
   public wcproduccionresumenfasesqueryviewer( )
   {
   }

   public wcproduccionresumenfasesqueryviewer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionresumenfasesqueryviewer.class ));
   }

   public wcproduccionresumenfasesqueryviewer( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionresumenfasesqueryviewer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionresumenfasesqueryviewer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Resumen Fases Query Viewer";
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

