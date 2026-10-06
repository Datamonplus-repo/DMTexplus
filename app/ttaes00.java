package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttaes00", "/app.ttaes00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttaes00 extends GXWebObjectStub
{
   public ttaes00( )
   {
   }

   public ttaes00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttaes00.class ));
   }

   public ttaes00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttaes00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttaes00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLAS DE DOSIFICACION de ESPESANTE y LIGANTE";
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

