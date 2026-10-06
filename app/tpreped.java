package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreped", "/app.tpreped"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreped extends GXWebObjectStub
{
   public tpreped( )
   {
   }

   public tpreped( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreped.class ));
   }

   public tpreped( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreped_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreped_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Realizacion Pedidos";
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

