package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.addressdisplay", "/app.wwpbaseobjects.addressdisplay"})
@jakarta.servlet.annotation.MultipartConfig
public final  class addressdisplay extends GXWebObjectStub
{
   public addressdisplay( )
   {
   }

   public addressdisplay( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( addressdisplay.class ));
   }

   public addressdisplay( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new addressdisplay_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new addressdisplay_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WWP_AddressDisplayMap";
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

