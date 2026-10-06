package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttslcc", "/app.ttslcc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttslcc extends GXWebObjectStub
{
   public ttslcc( )
   {
   }

   public ttslcc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttslcc.class ));
   }

   public ttslcc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttslcc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttslcc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST SOLIDEZ LUZ,PARM";
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

