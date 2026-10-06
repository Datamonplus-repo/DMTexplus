package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternosenvioww", "/app.trabajosexternosenvioww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternosenvioww extends GXWebObjectStub
{
   public trabajosexternosenvioww( )
   {
   }

   public trabajosexternosenvioww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternosenvioww.class ));
   }

   public trabajosexternosenvioww( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternosenvioww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternosenvioww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Trabajos Externos (Envio)";
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

