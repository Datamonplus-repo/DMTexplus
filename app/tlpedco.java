package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlpedco", "/app.tlpedco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlpedco extends GXWebObjectStub
{
   public tlpedco( )
   {
   }

   public tlpedco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlpedco.class ));
   }

   public tlpedco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlpedco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlpedco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PIEZAS PEDIDO COMERCIAL";
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

