package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rficco2", "/app.rficco2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rficco2 extends GXWebObjectStub
{
   public rficco2( )
   {
   }

   public rficco2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rficco2.class ));
   }

   public rficco2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rficco2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rficco2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA COLOR 2, CON COSTE";
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

