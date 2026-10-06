package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.etiquetascopias", "/app.etiquetascopias"})
@jakarta.servlet.annotation.MultipartConfig
public final  class etiquetascopias extends GXWebObjectStub
{
   public etiquetascopias( )
   {
   }

   public etiquetascopias( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( etiquetascopias.class ));
   }

   public etiquetascopias( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new etiquetascopias_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new etiquetascopias_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Etiquetas Copias";
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

