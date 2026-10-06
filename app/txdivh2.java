package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txdivh2", "/app.txdivh2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txdivh2 extends GXWebObjectStub
{
   public txdivh2( )
   {
   }

   public txdivh2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txdivh2.class ));
   }

   public txdivh2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txdivh2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txdivh2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIVIDIR HDRS";
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

