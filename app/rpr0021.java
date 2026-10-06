package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rpr0021", "/app.rpr0021"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rpr0021 extends GXWebObjectStub
{
   public rpr0021( )
   {
   }

   public rpr0021( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rpr0021.class ));
   }

   public rpr0021( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rpr0021_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rpr0021_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Produccion";
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

