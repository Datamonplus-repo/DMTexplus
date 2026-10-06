package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfacpro", "/app.tfacpro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacpro extends GXWebObjectStub
{
   public tfacpro( )
   {
   }

   public tfacpro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacpro.class ));
   }

   public tfacpro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacpro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacpro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "EST. FACTURACION PRODUCCION";
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

