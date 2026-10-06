package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcost00", "/app.tcost00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcost00 extends GXWebObjectStub
{
   public tcost00( )
   {
   }

   public tcost00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcost00.class ));
   }

   public tcost00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcost00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcost00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SIMULACION COSTES";
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

