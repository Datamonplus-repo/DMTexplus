package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txgehd2", "/app.txgehd2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txgehd2 extends GXWebObjectStub
{
   public txgehd2( )
   {
   }

   public txgehd2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txgehd2.class ));
   }

   public txgehd2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txgehd2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txgehd2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "GENERACION HDR MANUAL";
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

