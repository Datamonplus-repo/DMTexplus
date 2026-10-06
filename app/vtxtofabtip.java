package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.vtxtofabtip", "/app.vtxtofabtip"})
@jakarta.servlet.annotation.MultipartConfig
public final  class vtxtofabtip extends GXWebObjectStub
{
   public vtxtofabtip( )
   {
   }

   public vtxtofabtip( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( vtxtofabtip.class ));
   }

   public vtxtofabtip( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new vtxtofabtip_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new vtxtofabtip_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "O. Fabricacion - Tipos Definidos";
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

