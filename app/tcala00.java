package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcala00", "/app.tcala00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcala00 extends GXWebObjectStub
{
   public tcala00( )
   {
   }

   public tcala00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcala00.class ));
   }

   public tcala00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcala00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcala00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA PARAMETROS CALANDRAS";
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

