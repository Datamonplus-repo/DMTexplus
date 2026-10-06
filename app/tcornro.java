package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcornro", "/app.tcornro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcornro extends GXWebObjectStub
{
   public tcornro( )
   {
   }

   public tcornro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcornro.class ));
   }

   public tcornro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcornro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcornro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NUMERACION COLORES FUNCION SIGLAS";
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

