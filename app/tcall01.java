package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcall01", "/app.tcall01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcall01 extends GXWebObjectStub
{
   public tcall01( )
   {
   }

   public tcall01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcall01.class ));
   }

   public tcall01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcall01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcall01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Albaran de Produccion, TROZOS";
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

