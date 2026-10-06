package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclidtf", "/app.tclidtf"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclidtf extends GXWebObjectStub
{
   public tclidtf( )
   {
   }

   public tclidtf( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclidtf.class ));
   }

   public tclidtf( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclidtf_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclidtf_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DESCUENTOS CLIENTE INT FACT";
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

