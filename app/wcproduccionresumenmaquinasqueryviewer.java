package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionresumenmaquinasqueryviewer", "/app.wcproduccionresumenmaquinasqueryviewer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionresumenmaquinasqueryviewer extends GXWebObjectStub
{
   public wcproduccionresumenmaquinasqueryviewer( )
   {
   }

   public wcproduccionresumenmaquinasqueryviewer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionresumenmaquinasqueryviewer.class ));
   }

   public wcproduccionresumenmaquinasqueryviewer( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionresumenmaquinasqueryviewer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionresumenmaquinasqueryviewer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Resumen Maquinas Query Viewer";
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

