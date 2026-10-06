package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcaem00", "/app.tcaem00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcaem00 extends GXWebObjectStub
{
   public tcaem00( )
   {
   }

   public tcaem00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcaem00.class ));
   }

   public tcaem00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcaem00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcaem00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA PARAMETROS EMPAQUETAR";
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

