package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.salidasmanuales", "/app.salidasmanuales"})
@jakarta.servlet.annotation.MultipartConfig
public final  class salidasmanuales extends GXWebObjectStub
{
   public salidasmanuales( )
   {
   }

   public salidasmanuales( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( salidasmanuales.class ));
   }

   public salidasmanuales( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new salidasmanuales_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new salidasmanuales_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Salidas Manuales";
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

