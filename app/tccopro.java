package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tccopro", "/app.tccopro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccopro extends GXWebObjectStub
{
   public tccopro( )
   {
   }

   public tccopro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccopro.class ));
   }

   public tccopro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccopro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccopro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada de Colores y lineas Co";
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

