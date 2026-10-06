package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrf000", "/app.ttrf000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrf000 extends GXWebObjectStub
{
   public ttrf000( )
   {
   }

   public ttrf000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrf000.class ));
   }

   public ttrf000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrf000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrf000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRASLADO DE INSUMOS";
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

