package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ejemploqrcode", "/app.ejemploqrcode"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ejemploqrcode extends GXWebObjectStub
{
   public ejemploqrcode( )
   {
   }

   public ejemploqrcode( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ejemploqrcode.class ));
   }

   public ejemploqrcode( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ejemploqrcode_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ejemploqrcode_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ejemplo QRCODE";
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

