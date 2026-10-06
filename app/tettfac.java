package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tettfac", "/app.tettfac"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tettfac extends GXWebObjectStub
{
   public tettfac( )
   {
   }

   public tettfac( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tettfac.class ));
   }

   public tettfac( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tettfac_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tettfac_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DATOS ESTABILIDAD,TERMOF,ACABAR";
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

