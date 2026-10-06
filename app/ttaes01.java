package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttaes01", "/app.ttaes01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttaes01 extends GXWebObjectStub
{
   public ttaes01( )
   {
   }

   public ttaes01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttaes01.class ));
   }

   public ttaes01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttaes01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttaes01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLAS DE DOSIFICACION Intervalos";
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

