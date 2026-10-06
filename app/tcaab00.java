package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcaab00", "/app.tcaab00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcaab00 extends GXWebObjectStub
{
   public tcaab00( )
   {
   }

   public tcaab00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcaab00.class ));
   }

   public tcaab00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcaab00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcaab00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA DATOS ABRIR";
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

