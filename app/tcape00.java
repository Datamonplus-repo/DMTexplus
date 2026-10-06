package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcape00", "/app.tcape00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcape00 extends GXWebObjectStub
{
   public tcape00( )
   {
   }

   public tcape00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcape00.class ));
   }

   public tcape00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcape00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcape00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURAR PARAMETROS PERCHAS";
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

