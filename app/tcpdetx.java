package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcpdetx", "/app.tcpdetx"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcpdetx extends GXWebObjectStub
{
   public tcpdetx( )
   {
   }

   public tcpdetx( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcpdetx.class ));
   }

   public tcpdetx( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcpdetx_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcpdetx_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CABECERA PEDIDOS";
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

