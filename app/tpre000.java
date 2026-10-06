package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpre000", "/app.tpre000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpre000 extends GXWebObjectStub
{
   public tpre000( )
   {
   }

   public tpre000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpre000.class ));
   }

   public tpre000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpre000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpre000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO TINTE";
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

