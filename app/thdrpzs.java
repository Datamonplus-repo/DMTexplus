package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdrpzs", "/app.thdrpzs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdrpzs extends GXWebObjectStub
{
   public thdrpzs( )
   {
   }

   public thdrpzs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdrpzs.class ));
   }

   public thdrpzs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdrpzs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdrpzs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORME DETALLE DE PIEZAS";
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

