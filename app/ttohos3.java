package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttohos3", "/app.ttohos3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttohos3 extends GXWebObjectStub
{
   public ttohos3( )
   {
   }

   public ttohos3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttohos3.class ));
   }

   public ttohos3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttohos3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttohos3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PAROS INFOTINT";
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

